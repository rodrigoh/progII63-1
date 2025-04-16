package aula08;

import java.util.Scanner;

public class Exemplo01 {
	//Quando não precisar retornar um valor, usa void
	public static int soma(int v1, int v2){
		return v1+v2;
	}

	public static int leNumero(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextInt();
	}

	public static void main(String[] args) {
		int n1 = leNumero("Digite o primeiro número");
		int n2 = leNumero("Digite o segundo número");
		int resultado = soma(n1,n2);
		System.out.printf("%d + %d = %d\n",n1,n2,resultado);
	}
}