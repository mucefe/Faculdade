package switchCase;

import java.util.Scanner;

//Switch  - Desafio 1
//Produzido por Murilo C. Ferreira
//25.04.2023

/*Escreva um programa que solicite ao usuário que digite um número de 1 a 7 e exiba
o dia da semana correspondente*/

public class desafio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa adivinha o nome de um dia da semana baseado em seu número.");
		System.out.print("Insira o número do dia (de 1 a 7): ");
		int numDia = sc.nextInt();

		switch (numDia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Número inválido. Insira um número de 1 a 7.");
			break;
		}

		sc.close();
	}

}
