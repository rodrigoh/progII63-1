package aula05;

public class Exemplo04 {
	public static void main(String[] args) {
		int[] lista = {1, 2, 3, 4, 5, 6, 7};
		int[] copia = new int[lista.length];

		//Copia manual
		for(int i=0;i<lista.length;i++){
			copia[i] = lista[i];
		}
		//Copia usando o método arrayCopy
		System.arraycopy(lista,0,copia,0,lista.length);

		System.out.println("Dados em lista");
		for(int i=0;i<lista.length;i++){
			System.out.print(lista[i]+" ");
		}
		System.out.println("\nDados em copia");
		for(int i=0;i<copia.length;i++){
			System.out.print(copia[i]+" ");
		}

		copia[2] = 100;

		System.out.println("\nDados em lista");
		for(int i=0;i<lista.length;i++){
			System.out.print(lista[i]+" ");
		}
		System.out.println("\nDados em copia");
		for(int i=0;i<copia.length;i++){
			System.out.print(copia[i]+" ");
		}
	}
}
