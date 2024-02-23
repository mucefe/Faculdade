package ifElseIfElse;

import java.util.Scanner;

//If,Else If e Else - Desafio 4
//Produzido por Murilo C. Ferreira
//27/04/2023

/*Construa uma solução que peça ao usuário sua idade e verifique se ele é:
● Uma criança, com idade abaixo de 18 anos;
● Um jovem, com idade entre 18 e 30 anos;
● Um adulto, com idade entre 30 e 59 anos;
● Um idoso, com idade a partir de 60 anos.*/

public class desafio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a sua idade: ");
		int idade = sc.nextInt();
		
		if ((idade>0) && (idade <18)) {
			System.out.println("Você é uma criança");
		} else if ((idade>18) && (idade<30)) {
			System.out.println("Você é um jovem");
		} else if ((idade >30) && (idade<59)) {
			System.out.println("Você é um adulto");
		} else if (idade>59) {
			System.out.println("Você é um idoso");
		} else {
			System.out.println("Idade inválida.");
		}
		
		sc.close();

	}

}
