package aula06.exercicios;
/**
 * Ler um vetor de números, de 10 elementos. Declarar outro vetor inverso,
 * copiar todos os elementos de números de trás para frente para o vetor inverso.
 */

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		int[] vetor = new int[10];
		int[] inverso = new int[10];
		for(int i=0;i<vetor.length;i++){
			vetor[i] = aleatorio.nextInt(1,50);
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nInvertendo e mostrando o novo vetor");
		for(int i=0,j=9;i<vetor.length;i++,j--){
			inverso[i] = vetor[j];
			System.out.print(inverso[i]+" ");
		}


	}
}
