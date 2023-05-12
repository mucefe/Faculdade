package ifElseIfElse;

import java.text.DecimalFormat;
import java.util.Scanner;

//If,Else If e Else - Desafio 7
//Produzido por Murilo C. Ferreira
//02/05/2023

/*Você está construindo uma solução para calcular o valor final do salário de um
colaborador. Portanto, calcule o salário de um colaborador, sabendo que:
• A jornada de trabalho é de 40 horas semanais, ou 160 horas mensais;
• Caso haja horas extras, o valor a ser pago é de 50% a mais do valor normal da hora
para cada hora extra realizada.*/

public class desafio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioBruto = 0;
		double salarioLiquido = 0;
		double vlrHorasNormais = 0;
		double vlrHorasExtras = 0;
		int horas = 0;
		int horasExtras = 0;
		System.out.println("Este programa tem por finalidade calcular o salário líquido dos funcionários a partir\nda quantidade de horas extrar trabalhadas.\n");
		System.out.print("Insira o salário bruto do funcionário no mês: ");
		salarioBruto = sc.nextDouble();
		System.out.print("Insira o número de horas trabalhadas no mês: ");
		horas = sc.nextInt();
		DecimalFormat df = new DecimalFormat("##.##");
		limpaTela();
		System.out.flush();
		vlrHorasNormais = salarioBruto / 160;
		vlrHorasExtras = vlrHorasNormais + (0.5 * vlrHorasNormais);

		if (horas > 160) { // Calcula se há horas extras e o salário a ser recebido.
			horasExtras = horas - 160;
			salarioLiquido = salarioBruto + (vlrHorasExtras * horasExtras);

		} else {
			horasExtras = 0;
			salarioLiquido = salarioBruto;
		}

		if (horasExtras != 0) {
			System.out.println("Quantidade de horas extras: " + horasExtras);
		}
		System.out.println("Valor da hora normal: " + df.format(vlrHorasNormais));

		if (horasExtras != 0) {
			System.out.println("Valor da hora extra: " + df.format(vlrHorasExtras));

		}
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("Salário líquido: " + df.format(salarioLiquido));

		sc.close();
	}

	public static void limpaTela() {
		System.out.println(
				"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
