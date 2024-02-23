package array;

import java.util.Scanner;

//Array - Desafio 6
//Produzido por Murilo C. Ferreira
//22/05/2023

/*Para atender às necessidades de uma empresa, é preciso encontrar uma solução que
permita a inserção de 10 valores numéricos reais em um vetor. O resultado desejado
é que esses valores sejam impressos em ordem inversa àquela em que foram
armazenados.*/

public class desafio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vetor = new double[10];
		
		for (int i=0;i<vetor.length;i++) {
			System.out.print("Insira o " + (i+1) + "º número do vetor: ");
			vetor[i] = sc.nextDouble();
			sc.nextLine();
		}
		System.out.print("Ordem de gravação no vetor: ");
		for (int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i]);
			if (i!=vetor.length-1) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}
		System.out.print("\nOrdem inversa: ");
		for (int i=vetor.length-1;i>=0;i--) {
			System.out.print(vetor[i]);
			if (i!=0) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
		}
		sc.close();
	}

}
