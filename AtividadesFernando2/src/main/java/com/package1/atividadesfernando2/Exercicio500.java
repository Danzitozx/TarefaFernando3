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
public class Exercicio500 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int[] num1 = new int[5];
        int L, flag = 0, flag1 = 0, op;

        for (L = 0; L < 5; L++) {
            num[L] = 0;
            num1[L] = 0;
        }

        do {
            System.out.println("\n\n\n");
            System.out.println("\nVETORES");
            System.out.println("1 - Dados do VETOR A");
            System.out.println("2 - Dados do VETOR B");
            System.out.println("3 - Imprime VETORES");
            System.out.println("4 - Soma VETORES");
            System.out.println("5 - Subtrai VETORES");
            System.out.println("6 - Sai do programa");
            System.out.print("OPCAO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    entrada(num, 5, "A", scanner);
                    flag = 1;
                    break;
                case 2:
                    entrada(num1, 5, "B", scanner);
                    flag1 = 1;
                    break;
                case 3:
                    if (flag != 0 && flag1 != 0) {
                        imprime(num, 5, "A");
                        imprime(num1, 5, "B");
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 4:
                    if (flag != 0 && flag1 != 0) {
                        soma(num, num1, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 5:
                    if (flag != 0 && flag1 != 0) {
                        subtrai(num, num1, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 6:
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpcao invalida");
            }
        } while (op != 6);

        System.out.print("\n");
    }

    public static void entrada(int[] vetor, int tamanho, String nome, Scanner scanner) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite valor " + (i + 1) + " do vetor " + nome + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void imprime(int[] vetor, int tamanho, String nome) {
        System.out.println("\nVetor " + nome + ":");
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + " - " + vetor[i]);
        }
    }

    public static void soma(int[] a, int[] b, int tamanho) {
        System.out.println("\nSoma dos vetores:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + " - " + (a[i] + b[i]));
        }
    }

    public static void subtrai(int[] a, int[] b, int tamanho) {
        System.out.println("\nSubtração dos vetores (A - B):");
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + " - " + (a[i] - b[i]));
        }
    }
}

