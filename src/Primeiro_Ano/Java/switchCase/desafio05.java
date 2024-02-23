package switchCase;

import java.text.DecimalFormat;
import java.util.Scanner;

//Switch  - Desafio 5
//Produzido por Murilo C. Ferreira
//25.04.2023

/*Primeiramente, peça uma medida em metros ao usuário. Depois, pergunte para qual
unidade de medida ele deseja converter: centímetros, polegadas, pés ou
quilômetros. Ao final, apresente o valor da conversão.
Obs.: pesquise para realizar a conversão para centímetros, polegadas, pés e
quilômetros.*/

public class desafio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Esse programa recebe uma medida em metros e a converte para outras medidas á escolha do usuário");
		System.out.println("Insira uma medida em metros: ");
		double metros=sc.nextDouble();
		System.out.println("Para qual medida você deseja converter?");
		System.out.println("1 - Centímetros;");
		System.out.println("2 - Polegadas;");
		System.out.println("3 - Pés;");
		System.out.println("4 - Quilômetros;");
		System.out.println("Digite o número da opção desejada: ");
		int opcao=sc.nextInt();
		switch (opcao) {
		case 1:
		System.out.println(metros + "m são " + df.format(metros*100) + " centímetros.");	
		break;
		
		case 2:
		System.out.println(metros + "m são " + df.format(metros/1.54) + " polegadas.");
		break;
		
		case 3:
		System.out.println(metros + "m são " + df.format(metros*3.28084) + " pés.");
		break;
		
		case 4:
		System.out.println(metros + "m são " + df.format(metros/1000) + " quilômetros.");
		break;
		
		default:
		System.out.println("Opção inválida. Digite um número de 1 a 4.");
		break;
		}
		sc.close();
	}

}
