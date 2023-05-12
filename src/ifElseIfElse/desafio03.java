package ifElseIfElse;

import java.util.Scanner;

//If,Else If e Else - Desafio 3
//Produzido por Murilo C. Ferreira
//27/04/2023

/*Peça ao usuário um número de 1 a 7. Ao final, seu programa indicará a qual dia da
semana esse número corresponde.*/

public class desafio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero=0;
		System.out.print("Insira um número de 1 a 7: ");
		numero=sc.nextInt();
		if ((numero>=1) && (numero<=7)) {
			switch (numero) {
			
			case 1:
				System.out.println("Domingo");
				break;
				
			case 2:
				System.out.println("Segunda-feira");
				break;
				
			case 3:
				System.out.println("Terça-feira");
				break;
				
			case 4:
				System.out.println("Quarta-feira");
				break;
				
			case 5:
				System.out.println("Quinta-feira");
				break;
				
			case 6:
				System.out.println("Sexta-feira");
				break;
				
			case 7:
				System.out.println("Sábado");
				break;
			}
		} else {
			System.out.println("Eu falei de 1 a 7.");
		}
		
		sc.close();

	}

}
