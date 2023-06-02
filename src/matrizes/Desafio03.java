package matrizes;

import java.util.Scanner;

//Matrizes - Desafio 2
//Produzido por Murilo C. Ferreira
//31/05/2023

/*Uma empresa quer uma solução que leia três faturamentos nos últimos 6 meses do
ano.*/

public class Desafio03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String[] meses = {"Julho   ", "Agosto  ", "Setembro", "Outubro ", "Novembro", "Dezembro"};
		double[][] faturamento = new double[6][3];
		final int LINHAS=6;
		final int COLUNAS=3;
		
		System.out.println("Este programa lê os três faturamentos em cada mês do último semestre do ano e os \nimprime em uma tabela.\n");
		
		//Abastece a matriz com os faturamentos
		for (int i=0;i<LINHAS;i++) {
			for (int j=0;j<COLUNAS;j++) {
				System.out.print("Insira o " + (j+1) + "º faturamento do mês de " + meses[i] + ": ");
				faturamento[i][j]=sc.nextDouble();
			}
		}
		// Imprime a tabela com a matriz criada na tela
		System.out.println("===== FATURAMENTOS 2º SEMESTRE =====");
		System.out.println("Mês          1º Faturamento          2º Faturamento          3º Faturamento");
		for (int i=0;i<LINHAS;i++) {
			System.out.print(meses[i] + "          ");
			for (int j=0;j<COLUNAS;j++) {
				System.out.print(faturamento[i][j] + "                      ");
				if (j==(COLUNAS-1)) {
					System.out.println("");
				}
				
			}
		}

	}

}
