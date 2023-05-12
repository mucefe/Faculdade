package f0r;

import java.text.DecimalFormat;
import java.util.Scanner;

//For (para) - Desafio 3
//Produzido por Murilo C. Ferreira
//03/05/2023

/*Você irá criar um programa que solicita ao usuário um número divisor entre 1 e 9. Em
seguida, você fará a divisão dos números de 0 a 20 pelo número indicado pelo usuário.
Apresente o quociente e o resto de cada divisão.
Obs.: atenção para divisões por 0 (zero).*/

public class desafio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		double numero = 0.0;
		System.out.println("Este programa solicita um número de 1 a 9 e o utiliza como divisor para números de 0 a 20.");
		System.out.print("\n\nDigite um número de 1 a 9: ");
		numero = sc.nextInt();

		for (int i = 0; i < 20; i++) {
		if (i==0) {
			System.out.println(numero + " ÷ " + "0 = 0");
			System.out.println("Resto da divisão: " + (numero%0));
		} else {
		System.out.println(numero + " ÷ " + (i+1) + " = " + df.format(numero/(i+1)));
		System.out.println("Resto da divisão: " + df.format(numero%(i+1)));
		
		}
		}
		sc.close();
	}

}
