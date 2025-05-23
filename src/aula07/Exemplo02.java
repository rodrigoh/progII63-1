package aula07;

public class Exemplo02 {
	public static void main(String[] args) {
		//Declarando e inicializando uma matriz
		int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println("Quantidade de linhas da matriz: "+matriz.length);
		System.out.println("Quantidade de colunas da matriz: "+matriz[0].length);
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		System.out.println("\nUsando o for simplificado");
		for(int[] linha:matriz){
			for(int c:linha){
				System.out.printf("%02d ",c);
			}
			System.out.println();
		}
	}
}
