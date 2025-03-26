package aula05.exercicios;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia três notas de um aluno e calcule sua média.
 * Ao final do algoritmo pergunte se deseja efetuar o cálculo para mais algum aluno.
 * Se o usuário receber digitar S, leia novamente as três notas até que o usuário
 * responda não.
 */
public class Ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char resposta;
		do{
			System.out.print("Entre com a primeira nota do aluno: ");
			float n1 = ler.nextFloat();
			while(n1<0 || n1>10){
				System.out.print("A nota precisa estar entre 0 e 10: ");
				n1 = ler.nextFloat();
			}
			System.out.print("Entre com a segunda nota do aluno: ");
			float n2 = ler.nextFloat();
			while(n2<0 || n2>10){
				System.out.print("A nota precisa estar entre 0 e 10: ");
				n2 = ler.nextFloat();
			}
			System.out.print("Entre com a terceira nota do aluno: ");
			float n3 = ler.nextFloat();
			while(n3<0 || n3>10){
				System.out.print("A nota precisa estar entre 0 e 10: ");
				n3 = ler.nextFloat();
			}
			float media = (n1+n2+n3)/3;
			System.out.printf("A média do aluno é %.2f\n",media);
			System.out.print("Tem mais alunos s - sim, n - não: ");
			resposta = ler.next().toLowerCase().charAt(0);
		}
		while (resposta=='s');
	}
}
