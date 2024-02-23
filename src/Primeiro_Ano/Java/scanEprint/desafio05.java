package scanEprint;

import java.util.Scanner;

//Scan e Print - Desafio 5
//Produzido por Murilo C. Ferreira
//25/04/2023

/*Peça ao usuário um número inteiro e exiba sua tabuada de 1 a 10.*/

public class desafio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Este programa tem por finalidade requisitar um número ao usuário e exibir a sua tabuada de 1 a 10.");
		System.out.print("Insira um número inteiro de 1 a 10: ");
		int numero = sc.nextInt();

		System.out.println("\n\nTabuada de " + numero + ": ");
		for (int i = 0; i < 10; i++) {
			System.out.println(numero + " x " + (i + 1) + " = " + (numero * (i + 1)));
		}
		sc.close();
	}

}
