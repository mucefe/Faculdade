package excecoes;

//Tratamento de Exceções - Exercício 04
//Produzido por Murilo C. Ferreira
//04/09/2023

/*Escreva um programa que abra e leia um arquivo chamado "dados.txt" e
lide com a exceção de arquivo não encontrado.
Dica: FileNotFoundException e*/

import java.io.*;

public class Exercicio04 {

	public static void main(String[] args) {
		String nomeArquivo = "dados.txt";

		try {
			FileReader fileReader = new FileReader(nomeArquivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linha;
			while ((linha = bufferedReader.readLine()) != null) {
				System.out.println(linha);
			}

			bufferedReader.close(); // Fecha o arquivo após a leitura
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + nomeArquivo);
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		} finally {
			System.out.println("Programa encerrado.");
		}
		

	}

}
