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
public class Exercicio497 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int n, c;

        for (int L = 0; L < 10; L++) {
            System.out.print("Digite número " + (L + 1) + ": ");
            num[L] = scanner.nextInt();
        }

        System.out.print("Digite número de busca: ");
        n = scanner.nextInt();

        ordena(num, 10);
        c = busca(num, 10, n);

        System.out.println("\nVETOR:");
        for (int L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + num[L]);
        }

        if (c != -1) {
            System.out.println("\n\nPosição no vetor: " + (c + 1));
        } else {
            System.out.println("\n\nNÃO ENCONTRADO");
        }

        System.out.print("\n");
    }

    public static void ordena(int[] vetor, int tamanho) {
        Arrays.sort(vetor);
    }

    public static int busca(int[] vetor, int tamanho, int valor) {
        int inicio = 0, fim = tamanho - 1, meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}
