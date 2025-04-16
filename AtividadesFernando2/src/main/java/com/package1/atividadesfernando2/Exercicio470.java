/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.package1.atividadesfernando2;

import java.util.Scanner;

/**
 *
 * @author okmen
 */
public class Exercicio470 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num, pri;

        System.out.print("\nDigite um número > 0: ");
        num = scanner.nextInt();

        pri = primo(num);

        if (pri == 0) {
            System.out.println("\nÉ primo: " + num);
        } else {
            System.out.println("\nNão é primo: " + num);
        }

        System.out.print("\n");
    }

    public static int primo(int n) {
        if (n <= 1) return 1; // Não é primo
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return 1; // Não é primo
        }
        return 0; // É primo
    }
}
    

