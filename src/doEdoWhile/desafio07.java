package doEdoWhile;
import java.util.ArrayList;
import java.util.Scanner;
//Do e Do While - Desafio 6
//Produzido por Murilo C. Ferreira
//10/05/2023

/*A prefeitura de "Araquachussets" planeja conduzir uma pesquisa entre seus cidadãos,
a fim de coletar informações sobre seus nomes, idades, salários e número de filhos.
Para alcançar esse objetivo, sugiro a criação de um formulário online, que possa ser
preenchido pelos moradores da cidade.
Uma vez que a pesquisa tenha sido concluída, podemos utilizar os dados coletados
para gerar algumas informações estatísticas relevantes, tais como:
● A média de salário da população, que pode ser calculada dividindo-se a soma
de todos os salários pelo número total de respondentes.
● A média do número de filhos, que pode ser calculada dividindo-se a soma de
todos os filhos pelo número total de respondentes.
● O maior salário entre os habitantes, que pode ser identificado através da
comparação dos salários individuais.
● Uma lista com os nomes das pessoas cujo salário é inferior a R$ 1000,00. Essa
lista pode ser gerada filtrando-se os respondentes cujo salário é menor que
esse valor e extraindo seus nomes.
● A média de idade da população, que pode ser calculada da mesma forma que
a média de salário e a média de número de filhos.
Com essas informações em mãos, a prefeitura de "Araquachussets" poderá ter uma
melhor compreensão da situação econômica e demográfica de sua cidade, o que pode
ajudá-la a planejar políticas públicas mais eficazes.*/

public class desafio07 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome="";
		Integer idade=0;
		Integer nrFilhos=0;
		Integer respondentes=0;
		Double salario=0d;
		Double mediaSalarios=0d;
		Double mediaFilhos=0d;
		Double maiorSalario=0d;
		Double mediaIdades=0d;
		Boolean continua=false;
		
		ArrayList<String> FuncSalariosMenores = new ArrayList();
		ArrayList<Double> salarios = new ArrayList();
		
		do {
			
		respondentes++;
		System.out.print("Insira o seu nome: ");
		nome=sc.next();
		System.out.print("\nInsira a sua idade: ");
		idade=sc.nextInt();
		System.out.print("\nInsira o seu salário: ");
		salario=sc.nextDouble();
		System.out.print("Quantos filhos você tem?: ");
		nrFilhos=sc.nextInt();
		

		mediaIdades+=idade;
		mediaSalarios+=salario;
		salarios.add(salario);
		mediaFilhos+=nrFilhos;
		
		
		if (salario<1000) {
			FuncSalariosMenores.add(nome);
		}
		continua=continua();
		
		} while (continua==true);
		if (continua==true) {
			sc.nextLine();
		}
		
		for (int i = 0;i<salarios.size();i++) {
			if (i<(salarios.size())-1) {
				if (salarios.get(i)>salarios.get(i+1)) {
					maiorSalario=salarios.get(i);
				}
			}
			
			
		}
		
		mediaIdades/=respondentes;
		mediaSalarios/=respondentes;
		mediaFilhos/=respondentes;
		
		System.out.println("===== SENSO ARAQUACHUSSETS =====");
		System.out.println("A pesquisa ouviu um total de " + respondentes + " respondentes.");
		System.out.println("A média de salário da população é de R$ " + mediaSalarios );
		if (FuncSalariosMenores.size()>0) {
			System.out.print("Os seguintes moradores possuem salário abaixo de R$ 1000,00: ");	
		} else {
			System.out.println("Nenhum morador da cidade possui salário inferior a R$ 1000,00.");
		}
		
		for (int i=0;i<FuncSalariosMenores.size();i++) {
			System.out.print(FuncSalariosMenores.get(i) + ", ");
			
		}
		System.out.println("\nA média de idade da população é de " + mediaIdades + " anos.");
		System.out.println("O maior salário da cidade é: R$ " + maiorSalario);
		
	}

	public static boolean continua() {
		Scanner sc = new Scanner (System.in);
		char resp='\0';
		
		
		System.out.print("Deseja cadastrar um novo respondente? (S/N): ");
		resp=sc.next().charAt(0);
		resp=Character.toUpperCase(resp);
		if (resp=='S') {
			return true;			
		} else {
			return false;			
		}
		
	}
	
}

