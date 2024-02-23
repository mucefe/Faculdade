package excecoes;

import java.util.Scanner;

// Tratamento de Exceções - Exercício 02
// Produzido por Murilo C. Ferreira
// 04/09/2023

/*Escreva um programa Java que tente dividir dois números inteiros e
capture uma exceção de divisão por zero.*/

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro número inteiro: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		int num2 = sc.nextInt();
		double resultado=0;
		try {
			resultado = num1/num2;
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Erro: Divisão por zero!");
		} finally {
			System.out.println("Bloco Finally foi executado.");
		}
		sc.close();
	}

}
