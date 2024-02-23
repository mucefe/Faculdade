package matrizes;

import java.util.Scanner;

// Matrizes - Desafio 1
// Produzido por Murilo C. Ferreira
// 30/05/2023

/*O professor "Beico Zito" está em busca de uma solução que possa calcular a soma
de cada linha e a soma total de uma matriz 4x5. Para isso, ele precisa de um algoritmo
que possa realizar esses cálculos.*/

public class Desafio01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[][] matriz = new int[4][5];
		int[] somaLinhas = new int[4];
		final int LINHAS = 4;
		final int COLUNAS = 5;

		for (int i = 0; i < LINHAS; i++) {   // Abastece a matriz com números inteiros fornecidos pelo usuário
			for (int j = 0; j < COLUNAS; j++) {
				System.out.print("Elemento da linha " + (i + 1) + ", coluna " + (j + 1) + ": ");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matriz criada: ");   // Imprime a matriz na tela

		for (int i = 0; i < LINHAS; i++) {
			System.out.println();
			for (int j = 0; j < COLUNAS; j++) {
				System.out.print(matriz[i][j] + "\t");

			}
		}
		System.out.println("\n\nSoma das linhas da matriz: ");   // Imprime a soma dos elementos de cada linha da matriz
		for (int i = 0; i < LINHAS; i++) {
		    for (int j = 0; j < COLUNAS; j++) {
		        System.out.print(matriz[i][j]);
//		        somaLinhas[i] += matriz[i][j];
		        if (j != COLUNAS - 1) {
		            System.out.print(" + ");
		        } else {
		            System.out.print(" = " + somaLinhas[i]);
		        }
		    }
		    System.out.println();
		}

	}

}
