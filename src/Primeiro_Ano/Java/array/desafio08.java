package array;

import java.util.Scanner;
import java.util.Arrays;

//Array - Desafio 8
//Produzido por Murilo C. Ferreira
//23/05/2023


/*Faça um programa que leia 5 números inteiros digitados pelo usuário e 
 * armazene-os em um vetor. Em seguida, o programa deve ordenar os números 
 * em ordem crescente e imprimir o vetor ordenado.*/


public class desafio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];
		
		
		for (int i=0;i<5;i++) {   // Abastece o vetor com os números
			System.out.print("Insira o " + (i+1) + "º número: ");
			vetor[i]=sc.nextInt();
			sc.nextLine();
			System.out.print("\n");
		}
		System.out.println("Vetor original: ");   // Imprime o vetor original
		for (int i=0;i<5;i++) {
			System.out.print(vetor[i]);
			if (i!=4) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}
		Arrays.sort(vetor);  // Ordena o vetor
		System.out.println("\nVetor ordenado: ");
		for (int i=0;i<5;i++) {
			System.out.print(vetor[i]);
			if (i!=4) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		
			
		}
		
		sc.close();
	}

}
