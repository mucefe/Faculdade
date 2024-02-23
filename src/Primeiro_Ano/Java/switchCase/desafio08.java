package switchCase;

import java.util.Scanner;

//Switch  - Desafio 8
//Produzido por Murilo C. Ferreira
//25.04.2023

/*Desenvolva um programa que permita calcular o imposto de renda de uma pessoa.
O usuário informa o valor do salário bruto mensal e o programa deve calcular o valor
do imposto de acordo com a seguinte tabela:
● Salário até R$1.903,98: isento de imposto
● Salário de R$1.903,99 até R$2.826,65: 7,5% de imposto
● Salário de R$2.826,66 até R$3.751,05: 15% de imposto
● Salário de R$3.751,06 até R$4.664,68: 22,5% de imposto
● Salário acima de R$4.664,68: 27,5% de imposto
Calcule o valor do imposto de acordo com o salário informado pelo usuário e exiba o
resultado. Lembre-se de que o valor do imposto deve ser calculado apenas sobre a
diferença entre o salário e o limite inferior de cada faixa de imposto. Por exemplo, se
o salário for R$2.000,00, o valor do imposto será 7,5% sobre R$96,01 (R$2.000,00 -
R$1.903,99). Caso o valor do imposto seja igual a zero, exiba a mensagem "Isento
de imposto". Caso contrário, exiba o valor do imposto calculado.*/

public class desafio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario = 0.0;
		double imposto = 0;
		double aPagar = 0;
		double baseSalarial = 0;
		System.out.println("IMPOSTO DE RENDA");
		System.out.println("Este programa calcula o seu imposto de renda anual com base em seu salário.");
		System.out.print("Insira o seu salário mensal: ");
		salario = sc.nextDouble();
		if (salario < 1903.98) {
			imposto = 0;
		} else if ((salario > 1903.99) && (salario < 2826.65)) {
			imposto = 0.075;
			baseSalarial = 1903.99;
		} else if ((salario > 2826.65) && (salario < 3751.05)) {
			imposto = 0.15;
			baseSalarial = 2826.65;
		} else if ((salario > 3751.05) && (salario < 4664.68)) {
			imposto = 0.225;
			baseSalarial = 3751.05;
		} else if (salario > 4664.68) {
			imposto = 0.275;
			baseSalarial = 4664.68;
		} else {
			System.out.println("Salário inválido. Tente novamente.");
		}
		aPagar = ((salario - baseSalarial) * imposto);
		aPagar = Math.ceil(aPagar);
		System.out.println("Imposto pago por mês: R$ " + aPagar);
		System.out.println("Imposto pago por ano: R$ " + aPagar * 12);

		sc.close();
	}
}
