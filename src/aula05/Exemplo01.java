package aula05;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//int vetor[capacidade]
		//Um vetor de números inteiros com capacidade para 10 números e indices de 0 a 9
		int[] vetor = new int[10];
		String[] palavras = new String[20];
		//Lendo um vetor do teclado
		for(int i=0;i<10;i++){
			System.out.print("vetor["+i+"]: ");
			vetor[i] = ler.nextInt();
		}
		//Mostrando o vetor na tela
		for(int i=0;i<10;i++)
			System.out.print(vetor[i]+" ");
	}
}
