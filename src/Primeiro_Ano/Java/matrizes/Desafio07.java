package matrizes;

import java.util.Scanner;

//Matrizes - Desafio 7
//Produzido por Murilo C. Ferreira
//01/06/2023

/*Crie um programa para solicitar os valores de uma matriz 3x2. Em seguida, você
deverá fazer a transposição dessa matriz.
Obs.: pesquisar o que é matriz transposta.*/

public class Desafio07 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matriz = new int[3][2];
		int[][] transposta = new int[2][3];

		System.out.println("Criação da matriz: ");   // Cria a matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Insira o número da posição [" + i + "]" + "[" + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("MATRIZ CRIADA: ");   //Imprime a matriz criada
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 2; j++) {
				System.out.print(matriz[i][j] + "\t\t");
			}
		}

		for (int i = 0; i < 3; i++) {			// Transpõe a matriz
			for (int j = 0; j < 2; j++) {
				transposta[j][i] = matriz[i][j];
			}
		}
		System.out.println("Matriz transposta:");    //Imprime a matriz transposta na tela
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

	}
}
