package methods;

import java.util.Scanner;

//Methods - Desafio 3
//Produzido por Murilo C. Ferreira
//06/06/2023

/*Faça um programa que a partir do valor de uma compra, faça o cálculo de um desconto para o
usuário. O programa deve solicitar o valor total da compra por meio de um método, que deverá
retorná-lo. Um método deve ser criado para receber o valor da compra e mostrar o valor final
com desconto, considerando:
● Até R$100 - sem desconto, o valor permanece o mesmo
● De R$100,01 a R$200 - desconto de 20%
● Acima de R$200 - desconto de 30%*/

public class Desafio03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("O valor final da compra ficou em R$" + aplicaDesconto());

	}
	public static double solicitaValor() {
		System.out.print("Insira o valor da compra: ");
		double vlrCompra = sc.nextDouble();
		sc.nextLine();
		return vlrCompra;
	}
	public static double aplicaDesconto() {
		double vlr = solicitaValor();
		double desconto;
		if ((vlr >=100)&&(vlr<=200)) {
			desconto=(20.0/100.0)*vlr;
			vlr = vlr-desconto;
		} else if (vlr>200) {
			desconto=(30.0/100.00)*vlr;
			vlr = vlr-desconto;
		}
		return vlr;
	}
		
		
		
	}


