package doEdoWhile;


import java.text.DecimalFormat;
import java.util.Scanner;

//Do e Do While - Desafio 4
//Produzido por Murilo C. Ferreira
//10/05/2023

/*Você deverá desenvolver um algoritmo que solicite a idade, o gênero e o salário de
um grupo de pessoas. Para encerrar o programa, o usuário deve digitar "Finalizar".
Certifique-se de validar para que o usuário digite exatamente "Finalizar". Ao término
da execução do programa, será apresentado ao usuário as seguintes informações:
● A média de idade geral;
● A média de idade de pessoas do gênero feminino;
● A média de idade de pessoas do gênero masculino;
● A média salarial geral;
● A média salarial do gênero feminino;
● A média salarial do gênero masculino.
● O maior salário;
● O menor salário.*/

public class desafio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = 0;
		int somaIdades = 0;
		String genero = "";
		String resp = "";
		double salario = 0.0;
		int genHomens = 0;
		int genMulheres = 0;
		int genOutros = 0;
		double salHomens = 0.0;
		double salMulheres = 0.0;
		double salOutros = 0.0;
		
		do {
		System.out.print("Insira a idade do funcionário: ");
		idade = sc.nextInt();
		somaIdades += idade;
			//do {
			System.out.print("Insira o gênero do funcionário (M, F, Outro): ");
			genero = sc.next();
			genero=genero.toUpperCase();
			if (genero.equalsIgnoreCase("M")) {
				genHomens++;
			} else if (genero.equalsIgnoreCase("F")) {
				genMulheres++;
			} else if (genero.equalsIgnoreCase("Outro")) {
				genOutros++;
			} else {
				System.out.println("Resposta inválida. Atente-se às opções disponíveis e tente novamente.");
			}
			

		
		
		System.out.print("\nInsira o salário do funcionário: ");
		if (genero.equalsIgnoreCase("M")) {
			salario=sc.nextDouble();
			salHomens+=salario;
		} else if (genero.equalsIgnoreCase("F")) {
			salario=sc.nextDouble();
			salMulheres+=salario;
		} else {
			salario=sc.nextDouble();
			salOutros+=salario;
		}
		
		System.out.println("Digite 'FINALIZAR' para encerrar o programa ou 'CONTINUAR' para cadastrar um novo funcionário: ");
		resp=sc.next();
		
		
		}while (resp.equalsIgnoreCase("CONTINUAR"));
		
		//CÁLCULOS e TABELA
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("A média salarial da empresa é: R$ " + df.format((salHomens+salMulheres+salOutros)/(genHomens+genMulheres+genOutros)));
		System.out.println("A média de idade dos funcionários é: " + (somaIdades/(genHomens+genMulheres+genOutros) + " anos."));
		System.out.println("A média do salário das mulheres é: R$ " + df.format(salMulheres/genMulheres));
		System.out.println("A média do salário dos homens é: R$ " + df.format(salHomens/genHomens));
		System.out.println("A média do salário dos outros gêneros é: R$ " + df.format(salOutros/genOutros) + "\n\n");
		
		sc.close();
	}

}
