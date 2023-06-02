package matrizes;

import java.util.ArrayList;
import java.util.Scanner;



//Matrizes - Desafio 6
//Produzido por Murilo C. Ferreira
//01/06/2023

/*Crie duas matrizes 4x4 e compare para saber quantos elementos elas possuam que
são iguais. Apresente a quantidade e quais são esses elementos.*/

public class Desafio06 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] matrizA = new int[4][4];
		int[][] matrizB = new int[4][4];
		final int LINHAS=matrizA.length;
		final int COLUNAS=matrizA.length;
		ArrayList <Integer> numerosIguais = new ArrayList<>();
		int iguais=0;
		
		System.out.println("MATRIZ A: ");    // Cria a matriz A com números inteiros
		for (int i=0;i<LINHAS;i++) {
			for (int j=0;j<COLUNAS;j++) {
				System.out.print("Insira o número inteiro da posição [" + i + "][" + j + "]: ");
				matrizA[i][j]=sc.nextInt();
			}
		}
		System.out.println("MATRIZ B: ");   // Cria a matriz B com números inteiros
		for (int i=0;i<LINHAS;i++) {
			for (int j=0;j<COLUNAS;j++) {
				System.out.print("Insira o número inteiro da posição [" + i + "][" + j + "]: ");
				matrizB[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("\nMATRIZ A CRIADA: ");  // Imprime a matriz A na tela
		for (int i=0;i<LINHAS;i++) {
			System.out.println();
			for (int j=0;j<COLUNAS;j++) {
				System.out.print(matrizA[i][j] + "\t\t");
				if (j==COLUNAS) {
					System.out.println();
				}
			}
		}
		System.out.println("\nMATRIZ B CRIADA: ");   // Imprime a matriz B na tela
		for (int i=0;i<LINHAS;i++) {
			System.out.println();
			for (int j=0;j<COLUNAS;j++) {
				System.out.print(matrizB[i][j] + "\t\t");
				if (j==COLUNAS) {
					System.out.println();
				}
			}
		}
		
		for (int i=0;i<LINHAS;i++) {   // Verifica as duas matrizes em busca de nºs iguais
			for (int j=0;j<COLUNAS;j++) {// e os coloca numa lista de números iguais.
				if (matrizB[i][j]==matrizA[i][j]) {
					numerosIguais.add(matrizB[i][j]);
					iguais++;
				}
			}
		}
		
		if (iguais==0) {    // Imprime o resultado da comparação
			System.out.print("\nAs matrizes não possuem nenhum número igual.");
		} else if (iguais>1) {
			System.out.print("\nAs matrizes possuem " + iguais + " números iguais. São eles: ");
			for (int i=0;i<numerosIguais.size();i++) {
				if (i!=(numerosIguais.size()-1)){
					System.out.print(numerosIguais.get(i) + ", ");
				} else {
					System.out.print(numerosIguais.get(i) + ".");
				}
			}
		} else {
			System.out.println("\nAs matrizes possuem apenas o número " + numerosIguais.get(0) + "em comum.");
		}
		

	}

}
