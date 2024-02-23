package excecoes;

//Tratamento de Exceções - Exercício 01
//Produzido por Murilo C. Ferreira
//04/09/2023

/*try {
// Código onde uma exceção pode ocorrer
int resultado = 10 / 0; // Tentando dividir por zero
System.out.println(resultado);
} catch (ArithmeticException e) {
// Tratamento da exceção
System.out.println("Erro: Divisão por zero!");
} finally {
// Código que será executado independentemente de exceções
System.out.println("Bloco finally foi executado.");
}
Exercício 1: Crie uma classe e execute o bloco Try-Catch-Finally, acima:*/


public class Exercicio01 {

	public static void main(String[] args) {
		try {
			
			int resultado = 10 / 0; 
			System.out.println(resultado);
			} catch (ArithmeticException e) {
			
			System.out.println("Erro: Divisão por zero!");
			} finally {
			
			System.out.println("Bloco finally foi executado.");
			}

		
	}

}
