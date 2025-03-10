package aula01;

import java.util.Scanner;

public class Exemplo04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = ler.next();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = ler.next();
		System.out.println("Bem vindo "+nome+" "+sobrenome);
		System.out.printf("Bem vindo %s %s\n",nome,sobrenome);

	}
}
