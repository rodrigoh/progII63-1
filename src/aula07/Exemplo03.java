package aula07;

import java.util.Random;

public class Exemplo03 {
	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		Random aleatorio = new Random();
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = aleatorio.nextInt(1,50);
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		//Imprimindo a diagonal
		System.out.println("\nDiagonal da matriz\n");
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				if(l==c)
					System.out.print(matriz[l][c]+" ");
			}
		}
		System.out.println("\nDiagonal da matriz\n");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i]+" ");
		}
		System.out.println("\nDiagonal secundária\n");
		int tamanhoMenosUm = matriz.length-1;
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				if(l+c == tamanhoMenosUm){
					System.out.print(matriz[l][c]+" ");
				}
			}
		}
	}
}
