package methods;

import java.util.Scanner;

//Methods - Desafio 7
//Produzido por Murilo C. Ferreira
//06/06/2023

/*Aqui, você fará uma solução capaz de identificar o tipo e a área de triângulo que corresponde a
valores indicados por um usuário. Por isso, construa uma solução que receba 3 (três) valores
positivos e maiores do que 0 (zero) e, a partir deles, verificará qual o tipo de triângulo seria
formado pelos números indicados. Para definir e indicar o tipo de triângulo que pode ser
formado pelos números indicados, lembre-se que:
- Triângulo equilátero: possui os 3 (três) lados do triângulo iguais;
- Triângulo isósceles: possui os 2 (dois) lados do triângulo iguais;
- Triângulo escaleno: todos os lados do triângulo são diferentes*/

public class Desafio07 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		double num1=recebeNumeros("1º número");
		double num2=recebeNumeros("2º número");
		double num3=recebeNumeros("3º número");
		
		System.out.println("O triângulo é do tipo " + verificaTipo(num1, num2, num3));

	}
	
	public static double recebeNumeros(String ordem) {
		double nr;
		System.out.print("Insira o " + ordem + ": ");
		nr=sc.nextDouble();
		return nr;
	}
	public static String verificaTipo(double nr1, double nr2, double nr3) {
		String tipo="";
		if ((nr1==nr2) && (nr2==nr3)) {
			tipo="Equilátero";
		} else if ((nr1!=nr2) && (nr1!=nr3)) {
			tipo="Escaleno";
		} else if ((nr1!=nr2) || (nr1!=nr3)) {
			tipo="Isósceles";
		}
		return tipo;
	}

}
