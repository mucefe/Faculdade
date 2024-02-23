package methods;

import java.util.Scanner;

//Methods - Desafio 2
//Produzido por Murilo C. Ferreira
//06/06/2023

/*Faça um programa que solicite o ano de nascimento de um usuário e seja mostrada a sua idade
em 2021. Não é necessário considerar se o usuário já fez ou não aniversário. Um método deve
ser criado para solicitar o ano de nascimento ao usuário e retorná-lo, e outro método deve ser
criado para receber o ano de nascimento, calcular a idade atual e mostrá-la.*/

public class Desafio02 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Sua idade em 2021 é " + calculaIdade(solicitaAno()) + " anos.");
		

	}
	
	public static int solicitaAno(){
		System.out.print("Insira o seu ano de nascimento: ");
		int ano = sc.nextInt();
		return ano;
	}
	
	public static int calculaIdade(int ano) {
		int idade2021 = (2021-ano);
		return idade2021;
	}

}
