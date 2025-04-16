/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.package1.atividadesfernando2;

import java.util.Scanner;

/**
 *
 * @author okmen
 */
public class Exercicio460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, c;

        for (c = 0; c < 3; c++) {
            System.out.print("\n\nDigite número: ");
            a = scanner.nextInt();
            System.out.println("Dobro: " + dob(a));
        }

        System.out.print("\n");
    }

    public static int dob(int x) {
        return 2 * x;
    }
}