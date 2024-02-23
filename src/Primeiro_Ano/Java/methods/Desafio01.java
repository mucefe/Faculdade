package methods;

import java.util.Scanner;

//Methods - Desafio 1
//Produzido por Murilo C. Ferreira
//06/06/2023

/*Faça um programa que leia o nome e a idade de uma pessoa e, em seguida, crie um método
que receba essas informações e imprima essas informações ao usuário.*/

public class Desafio01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Insira a sua idade: ");
		int idade = sc.nextInt();
		impressoes(nome,idade);
		
		
	}
	
	public static void impressoes(String nome, int idade) {
		System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " anos.");
	}

}
