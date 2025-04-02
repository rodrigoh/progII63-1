package aula06.exercicios;

import java.util.Scanner;

/**
 * Declarar um vetor de até 100 números inteiros positivos, pedir
 * para o usuário digitar elementos para o vetor, até que ele digite
 * um 0 ou que o vetor esteja cheio, que encerra a leitura. Mostrar
 * o vetor lido.
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[100];
		int num=1;
		int i;
		for(i=0;i<vetor.length && num!=0;){
			System.out.print("vetor["+i+"]: ");
			num = ler.nextInt();
			if(num!=0){
				vetor[i] = num;
				i++;
			}
		}
		for(int j=0;j<i;j++){
			System.out.print(vetor[j]+" ");
		}
	}
}
