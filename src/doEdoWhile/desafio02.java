package doEdoWhile;

import java.util.Scanner;

//Do e Do While - Desafio 2
//Produzido por Murilo C. Ferreira
//10/05/2023

/*Criar um programa que solicita ao usuário dois números e, em seguida, pergunta qual
é o resultado da multiplicação desses dois números. Enquanto o usuário não acertar
a resposta, o programa deve informar que ele está errado e pedir para tentar
novamente. Quando o usuário acertar, o programa deve informar que o número está
correto e mostrar quantas vezes o usuário tentou até acertar.*/



public class desafio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA=0;
		int numB=0;
		int resposta=0;
		int contador=0;
		boolean validador=false;
		
		
		System.out.println("Este programa solicita dois números e em seguida pede o resultado da multiplicação desses dois números.");
		System.out.print("Insira o primeiro número: ");
		numA=sc.nextInt();
		System.out.print("Insira o segundo número: ");
		numB=sc.nextInt();
		do {
		contador++;
		System.out.print("Quanto é " + numA + " x " + numB + "?: ");
		resposta=sc.nextInt();
		
		if (resposta==(numA*numB)) {
			System.out.println("Resposta correta!");
			System.out.println("Este programa foi executado " + contador + " vezes.");
			validador=true;
		} else {
			System.out.println("\nResposta errada. Tente novamente.");
		}
		} while (validador==false);
		
		sc.close();
	}

}
