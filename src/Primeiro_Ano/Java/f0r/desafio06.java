package f0r;

//For (para) - Desafio 5
//Produzido por Murilo C. Ferreira
//04/05/2023

/*Prepare um código-fonte para um programa que verifica APENAS os números primos
de 1 a 100.
Obs.: pesquise o que são números primos*/

import java.util.Scanner;

public class desafio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa verifica os números primos no intervalo de 1 a 100.");
		System.out.println("Listando os números primos de 1 a 100");
		for (int i=2;i<100;i++) {
			if (verificaPrimo(i)){
				System.out.print(i);
					if (i==97) {
						System.out.println(".");
					} else {
						System.out.print(", ");
					}
			} 
				
			}
			sc.close();
		}
		
	public static boolean verificaPrimo(int num) {
		if (num<2) {
			return false;
		}
		for (int j = 2; j < num; j++) {
			if (num % j == 0)
				return false;
		}
		return true;
	}	
		
		
	}


