package switchCase;

import java.util.Scanner;

//Switch  - Desafio 2
//Produzido por Murilo C. Ferreira
//25.04.2023

/*Crie um programa que peça para o usuário selecionar uma figura geométrica de sua
escolha:
● Círculo;
● Quadrado;
● Retângulo;
● Triângulo.
Em seguida, peça os dados necessários para calcular e exibir a área da figura
selecionada.*/

public class desafio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma figura geométrica: ");
		System.out.println("1 - Círculo;");
		System.out.println("2 - Quadrado;");
		System.out.println("3 - Retângulo;");
		System.out.println("4 - Triângulo;");
		System.out.println("Digite o número da figura escolhida: ");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("----- CÍRCULO -----");
			System.out.println("Insira o valor do raio: ");
			double raio = sc.nextDouble();
			double area = (3.14 * (Math.pow(raio, 2)));
			System.out.println("A área do círculo é " + area);
			break;
		case 2:
			System.out.println("----- QUADRADO -----");
			System.out.println("Insira o valor do lado do quadrado: ");
			double lado = sc.nextDouble();
			double areaQ = Math.pow(lado, 2);
			System.out.println("A área do quadrado é " + areaQ);
			break;
		case 3:
			System.out.println("----- RETÂNGULO -----");
			System.out.println("Insira o valor da base do retângulo: ");
			double baseR = sc.nextDouble();
			System.out.println("Insira o valor da altura do retângulo: ");
			double altura = sc.nextDouble();
			System.out.println("A área do retângulo é " + (baseR * altura));
			break;
		case 4:
			System.out.println("----- TRIÂNGULO -----");
			System.out.println("Insira o valor da base do triângulo: ");
			double baseT = sc.nextDouble();
			System.out.println("Insira o valor da altura(h) do triângulo: ");
			double alturaT = sc.nextDouble();
			double areaT = ((baseT * alturaT) / 2);
			System.out.println("A área do triângulo é " + areaT);
			break;
		default:
			System.out.println("Número inválido. Digite um número de 1 a 4.");
			break;
		}
		sc.close();
	}

}
