package aula07;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//tipo[][] nome = new tipo[quantLinhas][quantColunas]
		int[][] matriz = new int[3][4];

		//Lendo a matriz do teclado
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 4; c++) {
				System.out.printf("matriz[%d][%d] = ",l,c);
				matriz[l][c] = ler.nextInt();
			}
		}
		//Mostrar a matriz
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 4; c++) {
				System.out.printf("%02d ",matriz[l][c]);
				//System.out.print(String.format("%02d ",matriz[l][c]));
			}
			System.out.println();
		}
	}
}
