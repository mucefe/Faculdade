package switchCase;

import java.util.Scanner;

import javax.swing.JOptionPane;

//Switch  - Desafio 6
//Produzido por Murilo C. Ferreira
//25.04.2023

/*Desenvolva um sistema de votação para uma eleição. O programa terá um menu
que deve permitir ao usuário digitar o número do candidato de sua escolha, que
varia de 1 a 5, e em seguida, exibir uma mensagem informando o nome e a
plataforma política do candidato escolhido.
Após o usuário digitar o número do candidato, deve-se verificar o número digitado e
exibir uma mensagem com o nome e a plataforma política do candidato escolhido.
Caso o número digitado não corresponda a nenhum candidato válido, o programa
deve exibir uma mensagem de erro.*/

public class desafio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//boolean continua = false;
		int candidatoA = 0;
		int candidatoB = 0;
		int candidatoC = 0;
		int candidatoD = 0;
		int candidatoE = 0;
		boolean verificador = false;

		do {
			System.out.println("ELEIÇÕES");
			System.out.println("1 - Candidato A");
			System.out.println("2 - Candidato B");
			System.out.println("3 - Candidato C");
			System.out.println("4 - Candidato D");
			System.out.println("5 - Candidato E");
			System.out.print("Insira o número do candidato em que deseja votar: ");
			int voto = Integer.parseInt(JOptionPane.showInputDialog("Digite o voto"));
			switch (voto) {
			case 1:
				System.out.println("Nome: Candidato A");
				System.out.println("Partido: AA");
				System.out.println("Plataforma: Direitos Humanos");
				System.out.print("Confirma o voto? (S/N): ");
				String confirmaA = JOptionPane.showInputDialog("Confirma o voto? (S/N): ");

				if ((confirmaA.length() == 1) && (confirmaA.equalsIgnoreCase("S"))) {
					candidatoA++;
					System.out.print("Há outros votantes? (S/N): ");
					String continua1 = JOptionPane.showInputDialog("Há outros votantes? (S/N): ");
					verificador = votaDenovo(continua1);

				}

				break;
			case 2:
				System.out.println("Nome: Candidato B");
				System.out.println("Partido: BB");
				System.out.println("Plataforma: Ecologia");
				System.out.print("Confirma o voto? (S/N): ");
				String confirmaB = JOptionPane.showInputDialog("Confirma o voto? (S/N): ");

				if ((confirmaB.length() == 1) && (confirmaB.equalsIgnoreCase("S"))) {
					candidatoB++;
					System.out.print("Há outros votantes? (S/N): ");
					String continua1 = JOptionPane.showInputDialog("Há outros votantes? (S/N): ");
					verificador = votaDenovo(continua1);

				}
				break;

			case 3:
				System.out.println("Nome: Candidato C");
				System.out.println("Partido: CC");
				System.out.println("Plataforma: Causa Animal");
				System.out.print("Confirma o voto? (S/N): ");
				String confirmaC = JOptionPane.showInputDialog("Confirma o voto? (S/N): ");

				if ((confirmaC.length() == 1) && (confirmaC.equalsIgnoreCase("S"))) {
					candidatoC++;
					System.out.print("Há outros votantes? (S/N): ");
					String continua1 = JOptionPane.showInputDialog("Há outros votantes? (S/N): ");
					verificador = votaDenovo(continua1);

				}
				break;

			case 4:
				System.out.println("Nome: Candidato D");
				System.out.println("Partido: DD");
				System.out.println("Plataforma: Inclusão Social");
				System.out.print("Confirma o voto? (S/N): ");
				String confirmaD = JOptionPane.showInputDialog("Confirma o voto? (S/N): ");

				if ((confirmaD.length() == 1) && (confirmaD.equalsIgnoreCase("S"))) {
					candidatoD++;
					System.out.print("Há outros votantes? (S/N): ");
					String continua1 = JOptionPane.showInputDialog("Há outros votantes? (S/N): ");
					verificador = votaDenovo(continua1);

				}
				break;

			case 5:
				System.out.println("Nome: Candidato E");
				System.out.println("Partido: EE");
				System.out.println("Plataforma: Direitos do Consumidor");
				System.out.print("Confirma o voto? (S/N): ");
				String confirmaE = JOptionPane.showInputDialog("Confirma o voto? (S/N): ");

				if ((confirmaE.length() == 1) && (confirmaE.equalsIgnoreCase("S"))) {
					candidatoE++;
					System.out.print("Há outros votantes? (S/N): ");
					String continua1 = JOptionPane.showInputDialog("Há outros votantes? (S/N): ");
					verificador = votaDenovo(continua1);

				}
				break;
			default:
				System.out.println("Opção inválida. Digite um número de 1 a 5.");
				//continua = true;
			}
		} while (verificador == true);
		System.out.println("\nNOME               PARTIDO               PLATAFORMA POLÍTICA                VOTOS");
		System.out.println(
				"Candidato A           AA                   Direitos Humanos                    " + candidatoA);
		System.out.println(
				"Candidato B           BB                        Ecologia                       " + candidatoB);
		System.out.println(
				"Candidato C           CC                     Causa Animal                      " + candidatoC);
		System.out.println(
				"Candidato D           DD                    Inclusão Social                    " + candidatoD);
		System.out.println(
				"Candidato E           EE               Direitos do Consumidor                  " + candidatoE);

		if ((candidatoA > candidatoB) && (candidatoA > candidatoC) && (candidatoA > candidatoD)
				&& (candidatoA > candidatoE)) {
			System.out.println("O candidato A venceu as eleições.");
		} else if ((candidatoB > candidatoA) && (candidatoB > candidatoC) && (candidatoB > candidatoD)
				&& (candidatoB > candidatoE)) {
			System.out.println("O candidato B venceu as eleições.");
		} else if ((candidatoC > candidatoA) && (candidatoC > candidatoB) && (candidatoC > candidatoD)
				&& (candidatoC > candidatoE)) {
			System.out.println("O candidato C venceu as eleições.");
		} else if ((candidatoD > candidatoA) && (candidatoD > candidatoB) && (candidatoD > candidatoC)
				&& (candidatoD > candidatoE)) {
			System.out.println("O candidato D venceu as eleições.");
		} else if ((candidatoE > candidatoA) && (candidatoE > candidatoB) && (candidatoE > candidatoC)
				&& (candidatoE > candidatoD)) {
			System.out.println("O candidato E venceu as eleições.");

		} else if ((candidatoA==candidatoB) && (candidatoB==candidatoC)  && (candidatoC==candidatoD) && (candidatoD==candidatoE)) {
			System.out.println("A eleição terminou em empate.");
		}
		sc.close();
	}

	public static boolean votaDenovo(String continua) {

		boolean continuaOuNao = false;
		if (continua.length() == 1 && continua.equalsIgnoreCase("S")) {
			System.out.println("Digite apenas uma letra.");
			continuaOuNao = true;
		} else if (continua.equalsIgnoreCase("N")) {
			continuaOuNao = false;
		} else {
			System.out.println("Resposta inválida.");
		}

		return continuaOuNao;

	}

}
