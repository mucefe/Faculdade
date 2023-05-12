package scanEprint;

import java.util.Scanner;

//Scan e Print - Desafio 4
//Produzido por Murilo C. Ferreira
//25/04/2023

/*Solicite ao usuário o nome, idade e altura (em metros). Ao final, mostre todas as
informações em uma única linha, de maneira organizada.*/

public class desafio04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String nome="";
	int idade=0;
	double altura;
	
	System.out.print("Insira o seu nome: ");
	nome=sc.nextLine();
	System.out.print("Insira a sua idade: ");
	idade=sc.nextInt();
	System.out.print("Insira a sua altura (em metros): ");
	altura=sc.nextDouble();
	System.out.println("O seu nome é " + nome + ", a sua idade é " + idade + " e a sua altura é " + altura);
	sc.close();
	}

}
