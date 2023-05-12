package scanEprint;
import java.util.Scanner;

// Scan e Print - Desafio 2
// Produzido por Tiago A. Ricaldi
// 24/04/2023

/*Prepare um código que solicita ao usuário dois números inteiros e exibe a soma, a
subtração, a multiplicação e a divisão desses números.*/

public class desafio02 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o numero 1: ");
		int numero1= sc.nextInt();
		System.out.print("Insira o numero 2: ");
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		int sub = numero1 - numero2;
		int mult = numero1 * numero2;
		int div = numero1 / numero2;
		
		System.out.printf("A soma é: "+soma+ "\n");
		System.out.printf("A subtração é: "+sub+"\n");
		System.out.printf("A multiplivação é: "+mult+"\n");
		System.out.printf("A divisão é: "+div+ "\n");
		
		sc.close();
}
}
