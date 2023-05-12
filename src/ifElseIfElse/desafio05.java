package ifElseIfElse;

import java.util.Scanner;

//If,Else If e Else - Desafio 5
//Produzido por Murilo C. Ferreira
//27/04/2023

/*Calcule o IMC de uma pessoa por meio de um programa. Nele, você solicitará o peso
do usuário em quilogramas (ex.: 58.9) e sua altura em metros (ex.: 1.68). A partir
dessas informações, você calculará seu Índice de Massa Corporal (IMC), indicando
se seu índice é:
● Abaixo do peso (IMC < 18,5)
● Peso normal (IMC 18,5-24,9)
● Sobrepeso (IMC 25-29,9)
● Obeso (IMC >= 30).*/

public class desafio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso=0;
		double altura=0;
		double imc=0;
		System.out.print("Insira o peso (kg): ");
		peso=sc.nextDouble();
		System.out.print("Insira a altura (m): ");
		altura=sc.nextDouble();
		
		imc=peso/(Math.pow(altura, 2));
		imc=Math.ceil(imc);
		
		System.out.println("IMC: " + imc);
		System.out.print("Status: ");
		if (imc<18.5) {
			System.out.println("Abaixo do peso");
		} else if ((imc>=18.5) && (imc<=24.9)) {
			System.out.println("Peso normal");
		} else if ((imc>=25) && (imc<=29.9)){
			System.out.println("Sobrepeso");
		} else if (imc>=30) {
			System.out.println("Obesidade");
		}
	sc.close();	
	}

}
