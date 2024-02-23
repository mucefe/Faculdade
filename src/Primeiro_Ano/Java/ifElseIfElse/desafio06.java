package ifElseIfElse;

import java.util.Scanner;

//If,Else If e Else - Desafio 6
//Produzido por Murilo C. Ferreira
//27/04/2023

/*Construa um programa que solicite ao usuário três comprimentos de lado e, em
seguida, verifique se é possível formar um triângulo. Se sim, exiba o tipo de triângulo.
Obs.: pesquise o que são triângulos equiláteros, isósceles e escalenos.*/

public class desafio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ladoA = 0;
		double ladoB = 0;
		double ladoC = 0;
		boolean triangulo=false;
		String tipo="";
		
		System.out.print("Insira o primeiro lado: ");
		ladoA = sc.nextDouble();
		System.out.print("Insira o segundo lado: ");
		ladoB = sc.nextDouble();
		System.out.print("Insira o segundo lado: ");
		ladoC = sc.nextDouble();
		
		if (((ladoA+ladoB)>ladoC) || ((ladoB+ladoC)>ladoA) || ((ladoA+ladoC)>ladoB)){
			triangulo=true;
			if ((ladoA==ladoB) && (ladoB==ladoC)) {
				tipo="Equilátero";
			} else if ((ladoA==ladoB) && (ladoB!=ladoC)) {
				tipo="Isósceles";
			} else if ((ladoA!=ladoB) && (ladoB!=ladoC)) {
				tipo="Escaleno";
			} else {
				System.out.println("Erro");
			}
		} else {
			triangulo=false;
		}
		if (triangulo==true){
			System.out.println("Os três comprimentos digitados formam um triângulo do tipo " + tipo + ".");
			
		} else {
			System.out.println("Os três comprimentos digitados não formam um triângulo.");
		}
		sc.close();
	}

}
