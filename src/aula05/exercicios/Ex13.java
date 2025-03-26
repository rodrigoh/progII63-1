package aula05.exercicios;

import java.util.Scanner;

/**
 * Escreva um algoritmo que pergunte ao usuário um número e após,
 * escreva na tela a soma total de 1 até o número lido. Exemplo:
 * Número lido é o 5. Resultado: 1+2+3+4+5 = 15
 */
public class Ex13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0;
		System.out.print("Digite um número: ");
		int num = ler.nextInt();
		for(int i=1;i<=num;i++)
			soma+=i;
		System.out.println(soma);
	}
}
