package f0r;

import java.util.Scanner;

//For (para) - Desafio 2
//Produzido por Murilo C. Ferreira
//03/05/2023

/*Solicite uma palavra ao usuário. Depois, apresente cada letra daquilo que ele
escreveu e conte quantos caracteres essa palavra tem.*/

public class desafio02 {

	public static void main(String[] args) {
		String palavra = "";
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa tem por finalidade receber uma palavra e em seguida apresentar cada \nletra e a quantidade de caracteres que ela contém.\n\n");
		System.out.print("Digite uma palavra: ");
		palavra = sc.nextLine();
		palavra=palavra.toUpperCase();
		
		for (int i=0;i<palavra.length();i++) {
			if (i<palavra.length()-1) {
			System.out.print(palavra.charAt(i) + ", ");
			} else if (i==(palavra.length()-1)) {
				System.out.print(palavra.charAt(i) + ".");
			}
		}
		System.out.println("\nEsta palavra possui " + (palavra.length()) + " caracteres.");
		
		
		sc.close();
	}

}
