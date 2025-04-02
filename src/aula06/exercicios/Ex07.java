package aula06.exercicios;

import java.util.Scanner;

/**
 * Ler um vetor que contenha as notas de uma turma de 10 alunos.
 * Calcular a média da turma e contar quantos alunos obtiveram nota
 * acima desta média calculada. Escrever a média da turma e o
 * resultado da contagem.
 */
public class Ex07 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float[] notas = new float[10];
		float soma = 0;
		for(int i=0;i<notas.length;i++){
			System.out.print("Qual a nota do "+(i+1)+"° aluno: ");
			notas[i] = ler.nextFloat();
			soma+=notas[i];
		}
		float media = soma/10;
		int cont=0;
		for(int i=0;i< notas.length;i++)
			if(notas[i]>media)
				cont++;
		System.out.printf("Estão acima da média %.2f %d alunos\n",media,cont);
	}
}
