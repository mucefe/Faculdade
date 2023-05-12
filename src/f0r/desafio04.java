package f0r;

import java.util.Scanner;

//For (para) - Desafio 4
//Produzido por Murilo C. Ferreira
//03/05/2023

/*Solicite dois números ao usuário. Você fará a soma e a média APENAS dos números
que se encontram entre os dois números informados.*/

public class desafio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = 0;
		int numB = 0;
		int soma=0;
		int numeros=0;
		
		
		System.out.println("Este programa tem por objetivo calcular a soma e a média dos números \nem um intervalo dado pelo usuário.");
		System.out.print("\nInsira o primeiro número do intervalo: ");
		numA=sc.nextInt();
		System.out.print("\nInsira o segundo número do intervalo: ");
		numB=sc.nextInt();
		
		for (int i = numA;i<=numB;i++) {
			soma+=i;
			numeros++;
		}
		double somaDouble = (double) soma;
		
		
		System.out.println("A soma dos números dentro do intervalo é: " + soma);
		System.out.println("A média dos números dentro do intervalo é: " + (somaDouble/numeros));
		
		sc.close();
	}

}
