package switchCase;

import java.text.DecimalFormat;
import java.util.Scanner;

//Switch  - Desafio 7
//Produzido por Murilo C. Ferreira
//25.04.2023

/*Construa uma calculadora que faça as operações básicas de soma, subtração,
multiplicação e divisão. Você solicitará 2 (dois) números, solicitará a operação e
mostrará o resultado desse cálculo. Caso seja selecionada uma divisão, você não
pode permitir que o 2º número seja 0 (zero).*/

public class desafio07 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Insira o primeiro número: ");
	int numA = sc.nextInt();
	System.out.print("Insira o segundo número: ");
	int numB = sc.nextInt();
	int opcao;
	
	System.out.println("1 - Soma;");
	System.out.println("2 - Subtração;");
	System.out.println("3 - multiplicação;");
	System.out.println("4 - divisão;");
	System.out.print("Digite o número da opção desejada: ");
	opcao = sc.nextInt();
	
	switch (opcao) {
	case 1:
		System.out.println("+++++ SOMA +++++");
		System.out.println(numA + " + " + numB + " = " + (numA+numB) );
				
		break;
		
	case 2:
		System.out.println("----- SUBTRAÇÃO -----");
		System.out.println(numA + " - " + numB + " = " + (numA-numB));
		
		break;
		
	case 3:
		System.out.println("***** MULTIPLICAÇÃO *****");
		System.out.println(numA + " x " + numB + " = " + (numA*numB));
		break;
		
	case 4:
		System.out.println("÷÷÷÷÷ DIVISÃO ÷÷÷÷÷");
		DecimalFormat df = new DecimalFormat("###.###");
		double numADouble=(double) numA;
		double numBDouble=(double) numB;
		double divisao = numADouble/numBDouble;
		if (numB!=0) {
			System.out.println(numA + " ÷ " + numB + " = " + df.format(divisao));
		} else {
			System.out.println("O segundo número não pode ser 0. Tente novamente com outro número");
		}
		break;
		
	default:
		System.out.println("Opção inválida. Escolha um número de 1 a 4.");
		break;
	}
	
	sc.close();
	}

}
