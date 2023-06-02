package doEdoWhile;

import java.util.Scanner;

//Do e Do While - Desafio 3
//Produzido por Murilo C. Ferreira
//10/05/2023

/*Você deve construir uma calculadora básica em programação. O programa deve
solicitar ao usuário que digite dois números e a operação matemática que deseja
realizar (adição, subtração, multiplicação ou divisão). Em seguida, o programa deve
exibir o resultado da operação matemática escolhida. O programa deve continuar em
execução até que o usuário decida encerrá-lo. Para encerrar o programa, o usuário
deve digitar APENAS “Continuar” ou “Finalizar”. Certifique-se de que o programa lide
com erros, como divisão por zero.*/


public class desafio03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int numA=0;
		int numB=0;
		int opcao=0;
		boolean validador=false;
		System.out.print("Insira o primeiro número inteiro: ");
		numA=sc.nextInt();
		System.out.print("Insira o segundo número inteiro: ");
		numB=sc.nextInt();
		
		do {
		System.out.println("Opções:");
		System.out.println("1 - Adição;");
		System.out.println("2 - Subtração;");
		System.out.println("3 - Multiplicação;");
		System.out.println("4 - Divisão;");
		System.out.println("5 - Finalizar;");
		System.out.print("Digite o número da opção desejada: ");
		opcao=sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("ADIÇÃO");
			System.out.println(numA + " + " + numB + " = " + (numA+numB));
			validador=continuaOuNao();
			break;
		case 2:
			System.out.println("SUBTRAÇÃO");
			System.out.println(numA + " - " + numB + " = " + (numA-numB));
			validador=continuaOuNao();
			break;
		case 3:
			System.out.println("MULTIPLICAÇÃO");
			System.out.println(numA + " x " + numB + " = " + (numA*numB));
			validador=continuaOuNao();
			break;
		case 4:
			System.out.println("DIVISÃO");
			if (numB>0){
				System.out.println(numA + " ÷ " + numB + " = " + (numA/numB));
				validador=continuaOuNao();
			} else if (numB==0) {
				System.out.println("Erro! O segundo número não pode ser 0. Tente outra opção de operação.");
				validador=true;
			} else {
				System.out.println("O segundo número tem um valor inválido. Tente outra opção de operação.");
				validador=true;
			}
			break;
			
		case 5:
			System.out.println("Programa finalizado.");
			validador=false;
			break;
			
		default:
			System.out.println("Opção inválida. Escolha um número de 1 a 5.");
			validador=true;
			break;
		}
		} while (validador==true);
		sc.close();
	}

	public static boolean continuaOuNao() {
		
		System.out.println("Continuar? (S/N)");
		String resposta=sc.nextLine();
		
		if (resposta.equalsIgnoreCase("S")) {
			
			return true;
		} else {
			System.out.println("Programa encerrado.");
			
			return false;
			
		}
		
	}
}
