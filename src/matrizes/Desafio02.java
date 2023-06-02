package matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

//Matrizes - Desafio 2
//Produzido por Murilo C. Ferreira
//30/05/2023

/*Faça um programa que leia as notas de 5 alunos em 3 avaliações e armazene-as em
uma matriz 5x3. Em seguida, o programa deve calcular e imprimir a média aritmética
de cada aluno.*/

public class Desafio02 {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("##.##");

    public static void main(String[] args) {
        String[] alunos = new String[5];
        double[] medias = new double[5];
        double[][] notas = new double[5][3];
        final int LINHAS = 5;
        final int COLUNAS = 3;

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Insira o nome do(a) " + (i + 1) + "º/ª aluno(a): ");
            alunos[i] = sc.nextLine();
        }

        for (int i = 0; i < LINHAS; i++) {
            double somaNotas = 0.0; // Variável para armazenar a soma das notas de cada aluno
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print("Insira a " + (j + 1) + "ª nota de " + alunos[i] + ": ");
                notas[i][j] = sc.nextDouble();
                somaNotas += notas[i][j];
            }
            medias[i] = somaNotas / COLUNAS; // Cálculo da média para cada aluno
        }

        System.out.println("=== RESULTADO FINAL ====");
        System.out.println("Aluno(a)\t\t1º Nota\t\t\t2º Nota\t\t\t3º Nota\t\t\tMédia Final");

        for (int i = 0; i < LINHAS; i++) {
            System.out.print(alunos[i] + "\t\t\t");
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(notas[i][j] + "\t\t\t");
            }
            System.out.println(df.format(medias[i]));
        }
    }
}
