package array;

import java.text.DecimalFormat;
import java.util.Scanner;

//Array - Desafio 1
//Produzido por Murilo C. Ferreira
//18/05/2023

/*Faça um programa que leia 10 números inteiros digitados pelo usuário e armazene-
os em um vetor. Em seguida, calcule e imprima a média desses números e informe o
2º maior e o 3º menor número.*/

public class desafio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		int[] numeros = new int[10];
		double media=0.0;
		
		
		System.out.println("Este programa recebe 10 números inteiros, armazena-os em \num vetor, calcula a média de todos os números e exibe o 2º e o 3º maior número. ");
		for (int i=0;i<numeros.length;i++) {   // Alimenta o vetor com os números
			System.out.println("Insira o " + (i+1) + "º número inteiro: ");
			numeros[i]=sc.nextInt();
		}
		for (int i=0;i<numeros.length;i++) {   // Faz a somatória dos elementos do vetor
			media+=numeros[i];
		}
		media/=numeros.length;     // Calcula a média
		
		System.out.print("Os números digitados foram: ");   // Imprime na tela os números digitados
		for (int i = 0;i<numeros.length;i++) {
			if (i!=(numeros.length-1)) {
			System.out.print(numeros[i] + ", ");
		} else {
			System.out.print(numeros[i] + ".");
		}
	}
		System.out.println("\nA média dos números digitados é: " + df.format(media));
		sc.close();
	}
	
}
