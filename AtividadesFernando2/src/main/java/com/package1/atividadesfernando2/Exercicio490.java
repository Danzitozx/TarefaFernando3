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
public class Exercicio490 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[10];

        for (int L = 0; L < 10; L++) {
            System.out.print("Digite palavra em letras minúsculas " + (L + 1) + ": ");
            nome[L] = scanner.nextLine();

            restantes(nome[L], nome[L].length(), 'c'); // Chamada da função restantes
        }

        for (int L = 0; L < 10; L++) {
            System.out.println("\n" + (L + 1) + " - " + nome[L]);
        }

        System.out.print("\n");
    }

    public static void restantes(String palavra, int tamanho, char letra) {
        int count = 0;

        for (int i = 0; i < tamanho; i++) {
            if (palavra.charAt(i) != letra) {
                count++;
            }
        }

        System.out.println("Letras diferentes de '" + letra + "': " + count);
    }
}