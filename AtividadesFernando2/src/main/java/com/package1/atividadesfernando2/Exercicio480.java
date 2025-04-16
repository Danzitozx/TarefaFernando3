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
public class Exercicio480 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n, x;

        System.out.print("\nDigite número: ");
        n = scanner.nextInt();

        x = reverso(n);

        System.out.println("\n" + n + " - " + x);

        if (x == n) {
            System.out.println("\nÉ um número capicua.");
        } else {
            System.out.println("\nNão é um número capicua.");
        }

        System.out.print("\n");
    }

    public static int reverso(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        return rev;
    }
}
    

