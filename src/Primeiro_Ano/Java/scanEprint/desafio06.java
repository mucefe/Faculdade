package scanEprint;

import java.util.Scanner;

//Scan e Print - Desafio 6
//Produzido por Murilo C. Ferreira
//25/04/2023

/*Peça um número real e exiba o mesmo arredondado para o inteiro.
Obs.: pesquise como funcionam os arredondamentos em Java.*/

public class desafio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número real: ");
		double numReal = sc.nextDouble();
		int numInt = (int) Math.round(numReal);
		System.out.println(numReal + " arredondado para inteiro é " + numInt + ".");
		sc.close();
		
	}

}
