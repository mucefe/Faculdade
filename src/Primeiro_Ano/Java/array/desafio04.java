package array;

import java.text.DecimalFormat;
import java.util.Scanner;

//Array - Desafio 4
//Produzido por Murilo C. Ferreira
//22/05/2023

/*Para atender às necessidades da empresa de meteorologia "Chuvisco Molhado", será
desenvolvida uma solução que armazena a temperatura média de cada mês do ano
em um vetor. Com base nesse vetor, serão calculados os seguintes resultados:
● A menor temperatura registrada durante o ano;
● A maior temperatura registrada durante o ano;
● A média da temperatura registrada durante o ano.*/

public class desafio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		double[] temp = new double[12];
		double menorTemp = 100.0, maiorTemp = 0.0, media = 0.0;

		for (int i = 0; i < temp.length; i++) { // Alimenta o vetor com as médias de temperatura
			System.out.print("Insira a temperatura do mês " + (i + 1) + ": ");
			temp[i] = sc.nextDouble();
			sc.nextLine();
		}

		for (int i = 0; i < temp.length; i++) {  // Percorre o vetor 'temp' em busca da menor temperatura
			if (temp[i]<menorTemp) {
				menorTemp=temp[i];
			}
		}
		
		for (int i=0;i<temp.length;i++) {  // Percorre o vetor 'temp' em busca da maior temperatura
			if (temp[i]>maiorTemp) {
				maiorTemp=temp[i];
			}
		}
		
		for (int i=0;i<temp.length;i++) { // Faz a somatória das temperaturas do ano e armazena na variável 'media'
			
			media+=temp[i];
		}
		media/=12;
		System.out.println("Menor temperatura do ano: " + menorTemp);
		System.out.println("Maior temperatura do ano: " + maiorTemp);
		System.out.println("Média das temperaturas do ano: " + df.format(media));

		sc.close();
	}

}
