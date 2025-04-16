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
public class Exercicio499 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int L, flag = 0, op;

        for (L = 0; L < 5; L++) {
            num[L] = 0;
        }

        do {
            System.out.println("\n\n\n");
            System.out.println("MENU VETOR - FUNCAO");
            System.out.println("1 - Dados do VETOR");
            System.out.println("2 - Ordena VETOR");
            System.out.println("3 - Imprime VETOR");
            System.out.println("4 - Sai do programa");
            System.out.print("OPCAO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    entrada(num, 5, scanner);
                    flag = 1;
                    break;
                case 2:
                    if (flag == 1) {
                        ordena(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;
                case 3:
                    if (flag == 1) {
                        imprime(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;
                case 4:
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpcao invalida");
            }
        } while (op != 4);

        System.out.print("\n");
    }

    public static void entrada(int[] vetor, int tamanho, Scanner scanner) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void ordena(int[] vetor, int tamanho) {
        Arrays.sort(vetor);
    }

    public static void imprime(int[] vetor, int tamanho) {
        System.out.println("\nVETOR:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + " - " + vetor[i]);
        }
    }
}

