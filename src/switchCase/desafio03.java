package switchCase;

import java.util.Scanner;

//Switch  - Desafio 3
//Produzido por Murilo C. Ferreira
//25.04.2023

/*Crie uma solução que peça um número inteiro de 1 a 12. Depois mostre o mês do
ano que esse número representa.*/

public class desafio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Este programa informa o nome de um mês a partir de seu respectivo número");
		System.out.print("Insira o número do mês: ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Número inválido. Digite um número de 1 a 12.");
			break;
		}
		sc.close();

	}

}
