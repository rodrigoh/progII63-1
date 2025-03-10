package aula01;

import java.util.Scanner;

public class Exemplo05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com uma medida em cm: ");
		float cm = ler.nextFloat();
		float metros = cm/100;
		System.out.printf("%.2f cm equivale(m) a %.2f m\n",cm,metros);
	}
}
