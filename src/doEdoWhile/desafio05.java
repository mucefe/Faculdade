package doEdoWhile;

import java.util.Scanner;

//Do e Do While - Desafio 5
//Produzido por Murilo C. Ferreira
//10/05/2023

/*Crie um programa que solicite dois números ao usuário. Enquanto ele não digitar o
resultado correto da soma desses dois números, mostre a mensagem "Tente
novamente". Quando o usuário acertar o resultado, exiba a mensagem "Resultado
correto!".*/

public class desafio05 {

	public static void main(String[] args) {
		int numA=0;
		int numB=0;
		int soma=0;
		boolean repete=false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esse programa recebe dois números e depois verifica se o usuário sabe a soma desses \ndois números.");
		System.out.print("Insira o primeiro número inteiro: ");
		numA=sc.nextInt();
		System.out.print("Insira o segundo número inteiro: ");
		numB=sc.nextInt();
		do {
		System.out.print(numA + " + " + numB + " = ");
		soma=sc.nextInt();
		 if (soma==(numA+numB)) {
			 System.out.println("Resultado correto!");
			 repete=false;
		 } else {
			 System.out.println("Tente novamente.");
			 repete=true;
		 }
		} while (repete==true);
		
		sc.close();
	}

}
