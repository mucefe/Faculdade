package array;

import java.util.Scanner;

//Array - Desafio 3
//Produzido por Murilo C. Ferreira
//22/05/2023

/*O Professor "Patolino da Selva" precisa de uma solução para alimentar dois vetores
com valores reais e, em seguida, armazenar em um terceiro vetor a soma dos
elementos dos dois vetores, respeitando as mesmas posições.*/

public class desafio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vetA = new double[3];
		double[] vetB = new double[3];
		double[] soma = new double[3];
		
		System.out.println("VETOR A");
		for(int i=0;i<vetA.length;i++) {
			System.out.print("Insira o " + (i+1) + "º número: ");
			vetA[i]=sc.nextDouble();
			sc.nextLine();
			
		}
		System.out.println("\nVETOR B");
		for (int i=0;i<vetB.length;i++) {
			System.out.print("Insira o " + (i+1) + "º número: ");
			vetB[i]=sc.nextDouble();
			sc.nextLine();
			
		}
		System.out.println("Vetor Soma: ");
		for (int i=0;i<soma.length;i++) {
			soma[i]=vetA[i]+vetB[i];
			System.out.print(soma[i]);
			if (i!=soma.length-1) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}
		sc.close();
	}

}
