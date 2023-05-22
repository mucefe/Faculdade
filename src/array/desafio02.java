package array;

import java.util.Scanner;

//Array - Desafio 2
//Produzido por Murilo C. Ferreira
//21/05/2023

/*Será construído um programa composto por um vetor de 5 (cinco) posições que será
alimentado com números inteiros. Inicialmente, o programa será desenvolvido sem o
uso de uma estrutura de repetição, a fim de evidenciar a facilidade de uso desse tipo
de estrutura.*/


public class desafio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];
		
		System.out.print("Insira o primeiro número inteiro: ");
		vetor[0] = sc.nextInt();
		sc.nextLine();
		System.out.print("Insira o segundo número inteiro: ");
		vetor[1] = sc.nextInt();
		sc.nextLine();
		System.out.print("Insira o terceiro número inteiro: ");
		vetor[2]=sc.nextInt();
		sc.nextLine();
		System.out.print("Insira o quarto número inteiro: ");
		vetor[3] = sc.nextInt();
		sc.nextLine();
		System.out.print("Insira o quinto número inteiro: ");
		vetor[4]=sc.nextInt();
		sc.nextLine();
		
		System.out.println("\nOs números do vetor são: " + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", " + vetor[3]+ ", " + vetor[4] + ".");
		
		sc.close();
	}

}
