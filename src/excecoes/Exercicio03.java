package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

//Tratamento de Exceções - Exercício 03
//Produzido por Murilo C. Ferreira
//04/09/2023

/*Crie um programa Java que leia um número inteiro do usuário e lide com
a exceção de entrada inválida.
Dica: InputMismatchException e*/

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite um número inteiro: ");
			int num = sc.nextInt();
			System.out.println("O número digitado foi: " + num);
		} catch (InputMismatchException e) {
			System.out.println("Isso não é um número inteiro!");
		
		} finally {
			System.out.println("Programa encerrado");
		}
	
		sc.close();
	}

}
