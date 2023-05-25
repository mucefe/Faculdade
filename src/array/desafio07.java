package array;


import java.text.DecimalFormat;
import java.util.Scanner;

//Array - Desafio 7
//Produzido por Murilo C. Ferreira
//22/05/2023

/*Uma turma do curso de programação da escola X é formada por 30 alunos. Faça um
programa que leia as notas de cada aluno em uma avaliação e armazene-as em um
vetor. O programa deve calcular e imprimir a média da turma e a quantidade de alunos
que ficaram acima da média.*/

public  class desafio07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		double[] notas = new double[30];
		double media=0.0;		
		int acimaMedia=0;
		
		for (int i=0;i<notas.length;i++) {   // Abastece o vetor com as notas
			System.out.print("\nInsira a " + (i+1) + "ª nota: ");
			notas[i]=sc.nextDouble();
			sc.nextLine();;
		}
		
		for (int i=0;i<notas.length;i++) {   // Faz a somatória das médias do vetor
			media+=notas[i];
		}
		media/=notas.length;
		
		for (int i=0;i<notas.length;i++) { // Calcula a quantidade de notas acima da média
			if (notas[i]>media) {
				acimaMedia++;
			}
		}
		// Prints
		System.out.println("A média geral da turma é: " + df.format(media) + ".");
		System.out.println(acimaMedia + " alunos ficaram acima da média da turma.");
		
		sc.close();
	}
	
}
