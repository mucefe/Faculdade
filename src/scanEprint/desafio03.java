package scanEprint;

import java.util.Scanner;

//Scan e Print - Desafio 3
//Produzido por Murilo C. Ferreira
//25/04/2023

/*Construa uma solução que solicita ao usuário um número inteiro e exibe se o número
é par ou ímpar.*/


public class desafio03 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um número inteiro: ");
		int numero = sc.nextInt();
		
		if ((numero%2)==0) {
			System.out.print(numero + " é um número par.");
		} else {
			System.out.println(numero + " é um número ímpar.");
		}
		sc.close();
		

	}

}
