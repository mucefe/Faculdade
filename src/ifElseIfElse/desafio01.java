package ifElseIfElse;

import java.util.Scanner;

//If,Else If e Else - Desafio 1
//Produzido por Murilo C. Ferreira
//27/04/2023

/*Construa um código capaz de solicitar ao usuário uma nota de 0 a 10. Se ele tirou: a
partir de 7, está aprovado; entre 5 e 6, está em recuperação; abaixo de 5, está
reprovado*/

public class desafio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a nota: ");
		double nota = sc.nextDouble();

		if ((nota > 7) && (nota <= 10)) {
			System.out.println("Aprovado.");
		} else if ((nota > 5) && (nota < 6)) {
			System.out.println("Em recuperação.");
		} else if ((nota>=0) && (nota < 5)) {
			System.out.println("Reprovado.");
		} else {
			System.out.println("Entrada inválida. Insira um número de 0 a 10.");
		}
		sc.close();

	}

}
