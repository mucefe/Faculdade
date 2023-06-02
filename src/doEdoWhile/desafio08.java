package doEdoWhile;

import java.util.Scanner;

//Do e Do While - Desafio 8
//Produzido por Murilo C. Ferreira
//17/05/2023

/*Foi conduzida uma pesquisa com "N" indivíduos sobre suas opiniões em relação à
pré-estreia de um filme. Os dados coletados incluíram sexo, idade e uma nota de 0 a
10 referente à opinião sobre o filme. As perguntas foram feitas repetidamente até que
todas as pessoas disponíveis tivessem respondido.
Com base nos resultados da pesquisa, podemos calcular e apresentar as seguintes
informações:
● A média de idade das pessoas que responderam ao questionário;
● Lista de pessoas que deram nota igual a 10;
● A quantidade de homens cujas opiniões sobre o filme foram inferiores a 5;
● A quantidade de mulheres cujas opiniões sobre o filme foram inferiores a 5;
● A quantidade de homens cujas opiniões sobre o filme foram superiores a 7;
● A quantidade de mulheres cujas opiniões sobre o filme foram superiores a 7;
● Média das notas informadas.
Essas informações podem ajudar a compreender melhor a recepção do público em
relação ao filme e a orientar decisões futuras da equipe responsável pela sua
promoção.
Obs.: não esqueça de validar se a nota está entre 0 e 10.*/

public class desafio08 {
static Scanner sc = new Scanner((System.in));
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String genero = "";
		double nota = 0.0;
		double mediaNotas=0.0;
		int respondentes = 0;
		int homens=0;
		int mulheres=0;
		int notas10 = 0;
		int homensInf5 = 0;
		int homensSup7 = 0;
		int mulheresInf5 = 0;
		int mulheresSup7 = 0;
		boolean continua = false;

		do {
			respondentes++;
			System.out.println("Insira o seu gênero (M ou F): ");
			genero = sc.next();
			genero = genero.toUpperCase();
			char gen = genero.charAt(0);

			System.out.println("Insira a nota do filme: ");
			nota = sc.nextDouble();
			
			
			if ((nota >= 0) && (nota <= 10)) {
				if (gen=='M') {
					homens++;
					if ((nota>=0) && (nota<5)) {
						homensInf5++;
					} else if ((nota>7) && (nota<10)) {
						homensSup7++;
					} else if (nota==10) {
						notas10++;
					}
				} else if (gen=='F') {
					mulheres++;
					if ((nota>=0) && (nota<5)) {
						mulheresInf5++;
					} else if ((nota>7) && (nota<10)) {
						mulheresSup7++;
					} else if (nota==10) {
						notas10++;
					}
				} else {
					System.out.println("Gênero inválido. Digite M ou F.");
					continua=true;
				}
			} else {
				System.out.println("Nota inválida! Insira um valor entre 0 e 10.");
				nota=0.0;
				continua=true;
				respondentes--;
			}
			mediaNotas+=nota;
			continua=continua();
		} while (continua == true);
		
		mediaNotas/=respondentes;
		System.out.println("===== PESQUISA DE OPINIÃO =====");
		System.out.println("A pesquisa entrevistou " + respondentes + " pessoas, sendo elas " + homens + " homens e " + mulheres + " mulheres.");
		System.out.println("A nota média do filme entre os entrevistados foi " + mediaNotas + ".");
		System.out.println(notas10 + " pessoas deram nota 10 ao filme.");
		System.out.println(homensSup7 + " homens deram nota acima de 7,0.");
		System.out.println(homensInf5 + " homens deram nota abaixo de 5,0.");
		System.out.println(mulheresSup7 + " mulheres deram nota acima de 7,0.");
		System.out.println(mulheresInf5 + " mulheres deram nota abaixo de 5,0.");
		sc.close();
	}

	public static boolean continua() {
		
		System.out.println("Deseja cadastrar um novo respondente? (S/N): ");
		String resp = sc.next();
		resp = resp.toUpperCase();
		char c = resp.charAt(0);
		if (c == 'S') {
			return true;
		} else {
			System.out.println("Programa encerrado.");
			return false;
		}
	}

}
