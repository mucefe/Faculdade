package ifElseIfElse;

import java.util.Scanner;

//If,Else If e Else - Desafio 2
//Produzido por Murilo C. Ferreira
//27/04/2023

/*Agora, prepare seu código para que ele receba 3 notas, calcule a média aritmética e
verifique se o aluno foi aprovado, está em recuperação ou está reprovado (use as
regras do Desafio 1).*/

public class desafio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media=0;
		double notas[]= new double[3];
		
		for (int i=0;i<3;i++) {   //Alimenta o vetor com as notas
			System.out.print("Insira a " + (i+1) + "ª nota: ");
			notas[i]=sc.nextDouble();
		}
		media=((notas[0]+notas[1]+notas[2])/3);
		media=Math.ceil(media);
		System.out.println("Média: " + media);
		System.out.print("Status do aluno: ");
		if (media >= 7.0) {
			System.out.print(" Aprovado.");
		} else if ((media >= 5.0) && (media <= 6.0)) {
			System.out.print(" Em recuperação.");
		} else if (media < 5.0) {
			System.out.print(" Reprovado.");
		} else {
			System.out.println("Erro.");
		}
		sc.close();
	}

}
