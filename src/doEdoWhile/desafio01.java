package doEdoWhile;

import java.util.Scanner;

//Do e Do While - Desafio 1
//Produzido por Murilo C. Ferreira
//10/05/2023

/*Você deverá desenvolver um programa que irá validar números digitados pelo usuário.
O programa continuará sendo executado enquanto o usuário digitar um número ímpar,
sendo que ele será encerrado assim que o usuário digitar um número par. Ao final do
programa, será informado quantos números foram digitados até que ele fosse
encerrado.*/

public class desafio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean verificador=false;
		int contador=0;
		int numero=0;
		
		do {
		System.out.print("Digite um número par: ");
		numero=sc.nextInt();
		
		if (numero%2==0) {
			contador++;
			System.out.println("Correto! Você digitou um numero par.\nEste programa foi executado " + contador + " vezes.");
			verificador=true;
		} else {
			contador++;
			System.out.println("Erro! Você digitou um número ímpar. Tente novamente.");
			verificador=false;
		}
		
		} while (verificador==false);
		sc.close();
	}

}
