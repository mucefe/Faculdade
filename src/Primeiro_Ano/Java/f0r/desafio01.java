package f0r;

import java.util.Scanner;

//For (para) - Desafio 1
//Produzido por Murilo C. Ferreira
//03/05/2023

/*Peça ao usuário 5 números. Em seguida, realize a soma apenas entre pares, entre
ímpares e entre todos eles.*/


public class desafio01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int[] numeros = new int[5];
		int somaPares=0;
		int somaImpares=0;
		int somaTotal=0;

		System.out.println("Este programa tem por finalidade receber 5 números e apresentar a soma dos números pares, \ndos números ímpares e a soma total dos números.\n\n");
		for (int i=0;i<5;i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			numero=sc.nextInt();
			numeros[i]=numero;
			if ((numero%2)==0) {
				somaPares+=numero;
			} else {
				somaImpares+=numero;
			}
			somaTotal+=numero;
		}
		
		System.out.println("Números digitados: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + numeros[3] + " e " + numeros[4]);
		System.out.println("Soma dos números pares:" + somaPares);
		System.out.println("Soma dos números ímpares: " + somaImpares);
		System.out.println("Soma de todos os números: " + somaTotal);
		sc.close();
	}

}
