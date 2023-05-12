package ifElseIfElse;

import java.util.Scanner;

//If,Else If e Else - Desafio 7
//Produzido por Murilo C. Ferreira
//02/05/2023

/*Você foi contratado para desenvolver um simulador de sistema de recomendação de
filmes. O sistema deve solicitar ao usuário informações sobre um filme, como nome,
duração em minutos e classificação indicativa. Com base nessas informações, o
sistema deve classificar o filme em uma categoria específica, levando em
consideração a duração e a classificação indicativa. As categorias são:
● Infantil: Filmes com duração menor que 60 minutos e classificação indicativa
livre;
● Adolescente: Filmes com duração entre 60 e 120 minutos e classificação
indicativa de 10, 12 ou 14 anos;
● Adulto: Filmes com duração maior que 120 minutos e classificação indicativa
de 16 ou 18 anos;
● Não recomendado: Filmes com duração maior que 60 minutos e classificação
indicativa livre.
Seu programa deve solicitar as informações do filme ao usuário, fazer as verificações
necessárias e exibir a categoria do filme de acordo com as regras acima. Caso o filme
não se enquadre em nenhuma categoria, o programa deve exibir uma mensagem
adequada.*/


public class desafio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome="";
		String categoria="";
		int classificacao=0;
		int duracao=0;
		
		System.out.println("Insira o nome do filme: ");
		nome=sc.nextLine();
		System.out.println("Insira a duração em minutos do filme: ");
		duracao=sc.nextInt();
		System.out.println("Insira a classificação indicativa do filme (0 para classificação livre,10,12,14,16 ou 18): ");
		classificacao=sc.nextInt();
		
		if ((duracao<60)&&(classificacao==0)) {
			categoria="Infantil";
		} else if ((((duracao>60) && (duracao<120)) && ((classificacao==10) || (classificacao==12) || (classificacao==14)))){
			categoria="Adolescente";
		} else if ((duracao>120) && ((classificacao==16) || (classificacao==18))) {
			categoria="Adulto";
		} else if ((duracao>60) && (classificacao==0)) {
			categoria="Não Recomendado";
		} else {
			categoria="Filme não classificado.";
		}
		
		System.out.println("A categoria do filme " + nome + " é " + categoria);

		sc.close();
	}

}
