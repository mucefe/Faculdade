package doEdoWhile;

import java.text.DecimalFormat;
import java.util.Scanner;

//Do e Do While - Desafio 6
//Produzido por Murilo C. Ferreira
//10/05/2023

/*A empresa de ginástica "Xôpeso Academy" precisa de uma solução que calcule e
mostre o IMC (Índice de Massa Corporal) de uma pessoa, utilizando a fórmula IMC =
Peso / (Altura) ^2. O programa deve permitir que o usuário execute a solução quantas
vezes desejar.*/

public class desafio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Este programa calcula o IMC de uma pesoa a partir do peso e da altura fornecidos pelo \nusuário.");
		boolean continua=false;
		String opcao="";
		double peso=0.0;
		double altura=0.0;
		double imc=0.0;
		do {
		System.out.print("Insira o peso: ");
		peso=sc.nextDouble();
		System.out.print("Insira a altura: ");
		altura=sc.nextDouble();
		
		imc=peso/(Math.pow(altura, 2));
				
		System.out.println("O IMC do paciente é " + df.format(imc));
		System.out.print("Deseja calcular o IMC de outro paciente? (S/N): ");
		opcao=sc.next();
		opcao=opcao.toUpperCase();
				
		if (opcao.equals("S")) {
			continua=true;
		} else {
			System.out.println("Programa encerrado.");
			continua=false;
		}
		} while (continua==true);
		
		sc.close();
	}

}
