package f0r;

import java.text.DecimalFormat;
import java.util.Scanner;

//For (para) - Desafio 5
//Produzido por Murilo C. Ferreira
//04/05/2023

/*Você construirá um boletim semestral. Para isso, construa um programa que solicite
as 4 notas de um aluno para as disciplinas de Matemática, História, Português e
Geografia. Em seguida, pergunte qual o peso de cada uma dessas notas. Em seguida,
calcule a média ponderada dessas notas. Ao final, deve-se exibir de maneira
organizada a disciplina, as notas tiradas e a média final conquistada pelo aluno.*/


public class desafio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		String nome;
		int peso=0;
		int[] pesos = new int[4];
		double nota=0.0;
		double mediaMat=0;
		double[] matematica = new double[4];
		double mediaHist=0;
		double[] historia = new double[4];
		double mediaPort=0;
		double[] portugues = new double[4];
		double mediaGeog=0;
		double[] geografia = new double[4];
		
		System.out.println("Este programa recebe as notas de um aluno, o peso de cada uma e as exibe calculadas em uma tabela.");
		System.out.print("Insira o nome do aluno: ");
		nome=sc.nextLine();
		nome=nome.toUpperCase();
		
		
		System.out.println("===== MATEMÁTICA ====="); //Alimenta o vetor 'matematica' com as 4 notas do semestre;
		for (int i=0;i<matematica.length;i++) {
			System.out.print("\nInsira a " + (i+1) + "ª nota do aluno em Matemática: ");
			nota=sc.nextDouble();
			matematica[i]=nota;
			mediaMat+=nota;
			
		}
		df.format(mediaMat/=4);		
		System.out.println("===== HISTÓRIA =====");
		for (int i=0;i<historia.length;i++) { //Alimenta o vetor 'historia' com as 4 notas do semestre;
			System.out.print("\nInsira a " + (i+1) + "ª nota do aluno em História: ");
			nota=sc.nextDouble();
			historia[i]=nota;
			mediaHist+=nota;
		}
		df.format(mediaHist/=4);
		System.out.println("===== PORTUGUÊS =====");//Alimenta o vetor 'portugues' com as 4 notas do semestre;
		for (int i=0;i<portugues.length;i++) {
			System.out.print("\nInsira a " + (i+1) + "ª nota do aluno em Português: ");
			nota=sc.nextDouble();
			portugues[i]=nota;
			mediaPort+=nota;
		}
		df.format(mediaGeog/=4);
		System.out.println("===== GEOGRAFIA =====");//Alimenta o vetor 'geografia' com as 4 notas do semestre;
		for (int i =0;i<geografia.length;i++) {
			System.out.print("\nInsira a " + (i+1) + "ª nota do aluno em Geografia: ");
			nota=sc.nextDouble();
			geografia[i]=nota;
			mediaGeog+=nota;
		}
		mediaGeog/=4;
		for (int i=0;i<4;i++) {  //Armazena o peso de cada nota do semestre;
			System.out.print("\nInsira o peso da " + (i+1) + "ª nota: ");
			peso=sc.nextInt();
			pesos[i]=peso;
		}
		//Tabela com as notas e médias separadas por matéria;
		System.out.println("\t\t\t\\t\ttALUNO: " + nome);
		System.out.println("MATÉRIA\t\t\t1ª NOTA\t\t\t2ª NOTA\t\t\t3ª NOTA\t\t\t4ª NOTA\t\t\tMÉDIA FINAL");
		System.out.println("Matemática\t\t" + matematica[0] + "\t\t\t" + matematica[1] + "\t\t\t" + matematica[2] + "\t\t\t" + matematica[3] + "\t\t\t" + df.format(mediaMat));
		System.out.println("História\t\t" + historia[0] + "\t\t\t" + historia[1] + "\t\t\t" + historia[2] + "\t\t\t" + historia[3] + "\t\t\t" + df.format(mediaHist));
		System.out.println("Portugês\t\t" + portugues[0] + "\t\t\t" + portugues[1] + "\t\t\t" + portugues[2] + "\t\t\t" + portugues[3] + "\t\t\t" + df.format(mediaPort));
		System.out.println("Geografia\t\t" + geografia[0] + "\t\t\t" + geografia[1] + "\t\t\t" + geografia[2] + "\t\t\t" + geografia[3] + "\t\t\t" + df.format(mediaGeog));
		
		
		
		sc.close();
	
	}
}
