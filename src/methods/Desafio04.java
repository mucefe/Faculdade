package methods;

import java.util.Scanner;
import java.util.Arrays;

//Methods - Desafio 4
//Produzido por Murilo C. Ferreira
//06/06/2023

/*Faça um programa que leia três números inteiros e verifique qual é o maior entre eles. Crie um
método para dar a entrada de dados nos 3 números e um método que receba como parâmetro
os 3 números e verifique/mostre qual é o menor número entre eles*/

public class Desafio04 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ordenaNumeros(recebeNumeros());

	}
	public static int[] recebeNumeros() {
		
		System.out.print("Insira o primeiro número: ");
		int numA = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		int numB = sc.nextInt();
		System.out.print("Insira o terceiro número: ");
		int numC=sc.nextInt();
		int[] vetor = {numA,numB,numC};
		return vetor;
	}
	
	public static void ordenaNumeros(int[] vetor) {
		Arrays.sort(vetor);
		System.out.print("Ordem dos números digitados:  ");
		for (int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i]);
			if (i!=vetor.length-1) {
				System.out.print(", ");
			} else {
				System.out.println(".");
			}
		}
	}
	

}
