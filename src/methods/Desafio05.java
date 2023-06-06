package methods;

import java.util.Scanner;

//Methods - Desafio 5
//Produzido por Murilo C. Ferreira
//06/06/2023

/*Faça um programa que leia um número inteiro por meio de um método e crie um outro
método que receba esse número como parâmetro para verificar e mostrar ao usuário se esse
número é positivo, negativo ou zero*/

public class Desafio05 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	verificaNumero(recebeNumero());

	}
	
	public static int recebeNumero() {
		System.out.print("Insira um número inteiro: ");
		int num = sc.nextInt();
		return num;
	}
	public static void verificaNumero(int num) {
		if (num>0) {
			System.out.println("O número digitado é positivo.");
		} else if (num<0) {
			System.out.println("O número digitado é negativo.");
		} else {
			System.out.println("O número digitado é 0.");
		}
	}

}
