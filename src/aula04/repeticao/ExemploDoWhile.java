package aula04.repeticao;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		int i = 10;
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}

		do {
			System.out.print(i + " ");
			i++;
		}
		while (i < 10);

		char resposta;
		do {
			System.out.print("Continuar s - sim, n - não: ");
			resposta = new Scanner(System.in).next().charAt(0);
		}
		while (resposta == 's');
	}
}
