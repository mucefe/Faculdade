package excecoes;

import java.util.Scanner;

//Tratamento de Exceções - Exercício 05
//Produzido por Murilo C. Ferreira
//04/09/2023

/*Crie um programa que manipule um array e capture a exceção de acesso
a um índice fora dos limites.
Dica: ArrayIndexOutOfBoundsException e*/

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] array = {1,2,3,4,5};
		
		
		try {
			System.out.println("Insira o tamanho do vetor: ");
			int tamanho = sc.nextInt();
			for (int i=0;i<tamanho;i++) {
				System.out.println(array[i] + ", ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro! Vetor fora de limites.");
		} finally {
			System.out.println("Programa encerrado.");
		}
		sc.close();
	}

}
