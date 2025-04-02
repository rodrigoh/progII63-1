package aula06.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Ler um vetor de 10 elementos inteiros. Após isto, imprimir na tela
 * os 10 valores lidos e o usuário poderá escolher um destes valores
 * para ser excluído do vetor. Ler o valor escolhido e eliminá-lo do
 * vetor. No momento da exclusão todos os valores posteriores ao
 * valor escolhido deverão ser reorganizados (movidos uma posição
 * para esquerda) a fim de que o vetor resultante não fique com um
 * espaço em branco. Imprimir o novo vetor.
 */
public class Ex11OpcFacil {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		int[] aux = new int[10];
		System.out.println("Números no vetor");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = aleatorio.nextInt(1, 100);
			System.out.print(vetor[i] + " ");
		}
		System.out.print("\nDos números acima qual deseja remover: ");
		int remove = ler.nextInt();
		int contA = 0;
		for(int i=0;i<vetor.length;i++){
			if(vetor[i]!=remove) {
				aux[contA] = vetor[i];
				contA++;
			}
		}
		System.out.println("\nNúmeros restantes no vetor");
		for(int i=0;i<contA;i++){
			System.out.print(aux[i]+" ");
		}
	}
}
