package methods;

import java.util.Scanner;

//Methods - Desafio 6
//Produzido por Murilo C. Ferreira
//06/06/2023

/*Construa uma solução que receba um valor inteiro como parâmetro e determine se ele é primo
ou não. Como requisito básico, exija que o valor seja apenas positivo. Quanto a validação, faça
uso de uma variável lógica, sendo que: ele será Verdadeiro quando o valor for primo; e Falso,
quando ele não for primo.*/


public class Desafio06 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Insira um número inteiro positivo: ");
		int num = sc.nextInt();
		boolean verificador= verificaPrimo(num);
		if (verificador) {
			System.out.println(num + " é um número primo.");
		} else {
			System.out.println(num + " não é um número primo.");
		}
	}
	public static boolean verificaPrimo(int num) {
		if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
		
		
				
		
		
	}


