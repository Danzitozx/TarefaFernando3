/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.package1.atividadesfernando2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author okmen
 */
public class Exercicio495 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[5];

        for (int L = 0; L < 5; L++) {
            System.out.print("Digite nome " + (L + 1) + ": ");
            nome[L] = scanner.nextLine();
        }

        ordena(nome, 5);

        System.out.println("\n\nNOMES ORDENADOS\n");

        for (int L = 0; L < 5; L++) {
            System.out.println((L + 1) + " - " + nome[L]);
        }

        System.out.print("\n");
    }

    public static void ordena(String[] nomes, int tamanho) {
        Arrays.sort(nomes);
    }
}
 
