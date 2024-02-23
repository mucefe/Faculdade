package switchCase;

import java.util.Scanner;

//Switch  - Desafio 4
//Produzido por Murilo C. Ferreira
//25.04.2023

/*Solicite que o usuário informe uma letra do alfabeto. Posteriormente, verifique se
essa letra é uma vogal, uma consoante ou um caractere inválido.*/

public class desafio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira uma letra do alfabeto: ");
		String letra = sc.nextLine();
		String vogalOuConsoante = "";

		if (letra.length() == 1) {
			if ((letra.equalsIgnoreCase("A")) || (letra.equalsIgnoreCase("E")) || (letra.equalsIgnoreCase("I")) || (letra.equalsIgnoreCase("O")) || (letra.equalsIgnoreCase("U"))) {
				vogalOuConsoante = "vogal";
			} else if (letra.equalsIgnoreCase("B") || letra.equalsIgnoreCase("C") || letra.equalsIgnoreCase("D") || letra.equalsIgnoreCase("F") || letra.equalsIgnoreCase("G") || letra.equalsIgnoreCase("H") || letra.equalsIgnoreCase("J") || letra.equalsIgnoreCase("K") || letra.equalsIgnoreCase("L") || letra.equalsIgnoreCase("M") || letra.equalsIgnoreCase("N") || letra.equalsIgnoreCase("P") || letra.equalsIgnoreCase("Q") || letra.equalsIgnoreCase("R") || letra.equalsIgnoreCase("S") || letra.equalsIgnoreCase("T") || letra.equalsIgnoreCase("V") || letra.equalsIgnoreCase("X") || letra.equalsIgnoreCase("Z") || letra.equalsIgnoreCase("Y") || letra.equalsIgnoreCase("W") || letra.equalsIgnoreCase("Ç")){
				vogalOuConsoante = "consoante";
			} else {
				System.out.println("Caractere inválido(especial). Digite uma vogal ou consoante.");
				vogalOuConsoante="inválido";
			}

		} else if (letra.length() != 1) {
			System.out.println("Digite apenas 1(uma) letra!!!");
		}
		if (vogalOuConsoante.equals("vogal") || vogalOuConsoante.equals("consoante")) {
		System.out.println("A letra " + letra + " é uma " + vogalOuConsoante + ".");
		}
		sc.close();
	}
}
