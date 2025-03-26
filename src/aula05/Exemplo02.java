package aula05;

public class Exemplo02 {
	public static void main(String[] args) {
		//Declarando e inicializando um vetor...
		int[] lista = {1, 2, 3, 4, 5, 6, 7};
		String[] nomes = {"Jonas", "Pedro", "Ana"};
		//sizeof(lista)/sizeof(int)
		System.out.println("O tamanho da lista é "+lista.length);
		System.out.println("O tamanho de nomes é "+nomes.length);
		//Mostrar a lista na tela
		for(int i=0;i<lista.length;i++){
			System.out.print(lista[i]+" ");
		}
	}
}
