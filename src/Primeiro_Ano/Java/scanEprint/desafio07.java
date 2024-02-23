package scanEprint;

import java.util.Scanner;

//Scan e Print - Desafio 7
//Produzido por Murilo C. Ferreira
//25/04/2023

/*Construa um conversor de temperaturas. Você solicitará uma temperatura em graus
Celsius e converterá para Fahrenheit e Kelvin, exibindo o resultado.
Obs.: pesquise como realizar a conversão de Celsius para Fahrenheit e Kelvin.*/

public class desafio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a temperatura em graus Celsius: ");
		double tempC=sc.nextDouble();
		double tempF=((tempC*1.8)+32);
		double tempK=(tempC+273.15);
		
		System.out.println(tempC + "°C"+"\nFarenheit: " + tempF + "°F\nKelvin: " + tempK + "K");
		
		
		sc.close();
	}

}
