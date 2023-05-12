package scanEprint;

import java.util.Scanner;

//Scan e Print - Desafio 8
//Produzido por Murilo C. Ferreira
//25/04/2023

/*Solicite ao usuário uma palavra e exibe o número de caracteres da palavra.
Obs.: pesquise como se faz a contagem de caracteres de um texto em Java.*/


public class desafio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um texto qualquer: ");
		String texto = sc.nextLine();
		int caracteres = texto.length();
		System.out.println("O texto digitado contem " + caracteres + " caracteres.");
		sc.close();
	}

}
