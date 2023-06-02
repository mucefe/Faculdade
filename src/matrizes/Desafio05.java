package matrizes;

import java.util.Scanner;

//Matrizes - Desafio 5
//Produzido por Murilo C. Ferreira
//01/06/2023

/*Uma empresa solicitou uma solução que permita a leitura de uma matriz 5 x 5
contendo números inteiros, e que gere outra matriz de mesmo tamanho, em que cada
elemento da nova matriz seja o dobro do elemento correspondente na matriz original.
O programa deve exibir tanto a matriz original quanto a nova matriz gerada.*/

public class Desafio05 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		int[][] matrizDobrada = new int[5][5];
		final int LINHAS=5;
		final int COLUNAS=5;
		
		for (int i=0;i<LINHAS;i++) {   // Preenche a matriz com os números inteiros
			for (int j=0;j<COLUNAS;j++) {
				System.out.print("Insira o número da posição " + "[" + i + "]" + "[" + j +"]: ");
				matriz[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("MATRIZ CRIADA: ");     // Mostra a matriz criada na tela
		for (int i=0;i<LINHAS;i++) {
			System.out.println();
			for (int j=0;j<COLUNAS;j++) {
				System.out.print(matriz[i][j] + "\t\t");
				if (i==COLUNAS) {
					System.out.print("\n");
				}
			}
		}
		
		for (int i=0;i<LINHAS;i++) {  // Dobra o valor da matriz original e o coloca na nova matriz
			for (int j=0;j<COLUNAS;j++) {
				matrizDobrada[i][j]=matriz[i][j]*2;
			}
		}
		
		System.out.println("\nMATRIZ DOBRADA: ");
		for (int i=0;i<LINHAS;i++) {
			System.out.println();
			for (int j=0;j<COLUNAS;j++) {
				System.out.print(matrizDobrada[i][j] + "\t\t");
				if (i==COLUNAS) {
					System.out.print("\n");
				}
			}
		}

	}

}
