package array;

import java.text.DecimalFormat;
import java.util.Scanner;

//Array - Desafio 5
//Produzido por Murilo C. Ferreira
//22/05/2023

/*Um professor deseja ter uma aplicação que calcule a média PONDERADA de seus
cinco alunos durante o bimestre. O bimestre é composto por três notas, portanto, é
necessário criar dois vetores para armazenar cada uma das notas dos alunos. Em
seguida, outro vetor deve ser criado para armazenar o resultado da média dos alunos.*/

public class desafio05 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("##.##");
		Scanner sc = new Scanner(System.in);
		String[] alunos = new String[5];
		int[] pesos = new int[3];
		double[][] notas = new double[5][3];
		double[] medias = new double[5];
		int somaPesos=0;

		for (int i=0;i<alunos.length;i++) {
			System.out.println("Insira o nome do(a) " + (i+1) + "º/ª aluno(a): ");
			alunos[i] = sc.nextLine();
		}
		
		for (int i = 0; i < 5; i++) {   //Alimenta a matriz com as notas
			for (int j = 0; j < 3; j++) {
				System.out.println("Insira a " + (j + 1) + "ª nota de " + alunos[i] + ": ");
				notas[i][j] = sc.nextDouble();
				sc.nextLine();
			}
		}
		
		for (int i=0;i<pesos.length;i++) {   // Estabelece o peso de cada nota do bimestre
			System.out.println("Insira o peso da " + (i+1) + "ª nota do bimestre:  ");
			pesos[i]=sc.nextInt();
			sc.nextLine();
			somaPesos+=pesos[i];
		}
		
		// Cálculo das médias
		
		medias[0]+=((notas[0][0]*pesos[0]) + (notas[0][1]*pesos[1]) + (notas[0][2])*pesos[2])/somaPesos;
		medias[1]+=((notas[1][0]*pesos[0]) + (notas[1][1]*pesos[1]) + (notas[1][2])*pesos[2])/somaPesos;
		medias[2]+=((notas[2][0]*pesos[0]) + (notas[2][1]*pesos[1]) + (notas[2][2])*pesos[2])/somaPesos;
		medias[3]+=((notas[3][0]*pesos[0]) + (notas[3][1]*pesos[1]) + (notas[3][2])*pesos[2])/somaPesos;
		medias[4]+=((notas[4][0]*pesos[0]) + (notas[4][1]*pesos[1]) + (notas[4][2])*pesos[2])/somaPesos;
		sc.close();
		
		// Print da tabela com as informações
		System.out.println("\t\t\t\t\t===== MÉDIAS BIMESTRAIS =====");
		System.out.println("ALUNO\t\t\t\t1ª Nota\t\t\t\t2ª Nota\t\t\t\t3ª Nota\t\t\t\tMédia Final");
		System.out.println(alunos[0] + "\t\t\t" + notas[0][0] + "\t\t\t\t" + notas[0][1] + "\t\t\t\t" + notas[0][2] + "\t\t\t\t" + df.format(medias[0]));
		System.out.println(alunos[1] + "\t\t\t" + notas[1][0] + "\t\t\t\t" + notas[1][1] + "\t\t\t\t" + notas[1][2] + "\t\t\t\t" + df.format(medias[1]));
		System.out.println(alunos[2] + "\t\t\t" + notas[2][0] + "\t\t\t\t" + notas[2][1] + "\t\t\t\t" + notas[2][2] + "\t\t\t\t" + df.format(medias[2]));
		System.out.println(alunos[3] + "\t\t\t" + notas[3][0] + "\t\t\t\t" + notas[3][1] + "\t\t\t\t" + notas[3][2] + "\t\t\t\t" + df.format(medias[3]));
		System.out.println(alunos[4] + "\t\t\t" + notas[4][0] + "\t\t\t\t" + notas[4][1] + "\t\t\t\t" + notas[4][2] + "\t\t\t\t" + df.format(medias[4]));
System.out.println("\n------------------------------------------------------------------------------------------------------------");	}

}
