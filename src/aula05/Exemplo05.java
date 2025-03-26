package aula05;

import java.util.Random;

public class Exemplo05 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetor = new int[10];
		for(int i=0;i<vetor.length;i++){
			vetor[i] = aleatorio.nextInt(200);
		}

		//Usando o for "simplificado"
		for(int i:vetor)
			System.out.print(i+" ");

		//Usando for "normal"
		for(int i=0;i<vetor.length;i++){
			System.out.print(vetor[i]+" ");
		}
	}
}
