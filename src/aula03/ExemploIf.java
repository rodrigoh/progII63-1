package aula03;

import java.util.Scanner;

public class ExemploIf {
	public static void main(String[] args) {
		// <, >, <=, >=, ==, !=
		// E = &&, OU = ||, Não = !
		System.out.print("Entre com um número inteiro: ");
		int numero = new Scanner(System.in).nextInt();
		//Usando o if para classificar o número
		if(numero==0)
			System.out.println("O número é zero");
		else if(numero>0)
			System.out.println(numero+" é positivo");
		else {
			System.out.println(numero+" é negativo");
			System.out.println("...");
		}
		//Testando se o valor está entre 10 e 20
		if(numero>10 && numero<20)
			System.out.println("O número "+numero+" está entre 10 e 20");





	}
}
