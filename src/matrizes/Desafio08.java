package matrizes;

import java.util.Scanner;

//Matrizes - Desafio 8
//Produzido por Murilo C. Ferreira
//01/06/2023

/*Desenvolva um programa em Java que leia uma matriz de dimensões 4x4 e exiba o
resto da divisão de cada elemento da diagonal principal por 3. Além disso, apresente
também produto total da diagonal secundária da matriz.*/

public class Desafio08 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        System.out.println("Este programa cria uma matriz 4x4, exibe o resto da divisão de cada elemento da diagonal principal, \nalém do produto total da diagonal secundária.");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Insira o número da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMATRIZ CRIADA: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t\t");
            }
        }
        
        System.out.println("\nResto da divisão dos elementos na diagonal principal: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i] + "%" + "3 = " + (matriz[i][i] % 3));
        }
        
        System.out.println("\nResto da divisão dos elementos na diagonal secundária: ");
        for (int i = matriz.length - 1; i >= 0; i--) {
            System.out.println(matriz[i][matriz.length - 1 - i] + "%" + "3 = " + (matriz[i][matriz.length - 1 - i] % 3));
        }
    }
}