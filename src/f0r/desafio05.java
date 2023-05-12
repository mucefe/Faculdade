package f0r;

import java.util.Scanner;

//For (para) - Desafio 5
//Produzido por Murilo C. Ferreira
//03/05/2023

/*Construa um programa que solicita ao usuário uma frase. Ao final, indique quantas
vogais, consoantes, espaços e outros caracteres compõem essa frase.*/

public class desafio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		int vogais = 0;
		int consoantes = 0;
		int espacos = 0;
		int outros = 0;
		
		System.out.println("Este programa calcula a quantidade de vogais, consoantes, espaços e outros \ncaracteres em uma frase fornecida pelo usuário.\n\n");
		System.out.print("Insira uma frase: ");
		frase=sc.nextLine();
		frase=frase.toUpperCase();
		for (int i=0;i<frase.length();i++) {
			char c=frase.charAt(i);
			if ((c=='A') || (c=='E') || (c=='I') || (c=='O') || (c=='U')){
				vogais++;
			} else if ((c=='B') || (c=='C') || (c=='D') || (c=='F') || (c=='G') || (c=='H') || (c=='J') || (c=='L') || (c=='M') || (c=='N') || (c=='P') || (c=='Q') || (c=='R') || (c=='S') || (c=='T') || (c=='V') || (c=='X') || (c=='Z') || (c=='K') || (c=='Y') || (c=='W')) {
				consoantes++;
			} else if (c==' '){
				espacos++;
			} else {
				outros++;
			}
					
		}
		System.out.println("A frase digitada contém " + vogais + " vogais, " + consoantes + " consoantes, " + espacos + " espaços e " + outros + " caracteres especiais.");
		sc.close();
	}

}
