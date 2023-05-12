package scanEprint;
import java.util.Scanner;

//Scan e Print - Desafio 1
//Produzido por Murilo C. Ferreira
//24.04.2023

/*Construa uma solução que solicite ao usuário seu nome e idade. Em seguida, exiba
uma saudação com o nome digitado e informe a idade dessa pessoa.*/

public class desafio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira seu nome: ");
		String nome=sc.nextLine();
		System.out.print("Insira a sua idade: ");
		int idade = sc.nextInt();
		System.out.print("Olá, " + nome +". Você tem " + idade + " anos de idade.");
		sc.close();
	}

}
