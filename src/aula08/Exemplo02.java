package aula08;

public class Exemplo02 {

	public static void imprimeMatriz(int[][] matriz){
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		imprimeMatriz(matriz);
	}
}
