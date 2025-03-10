package aula01;

public class Exemplo01 {
	public static void main(String[] args){
		int altura = 180;
		String nome = "Rodrigo";

		//Imprimindo texto na tela
		//Imprime o texto e quebra a linha no final
		System.out.println("Mensagem a ser impressa na tela");
		//Imprime o texto e não quebra a linha no final
		System.out.print("Mensagem a ser impressa na tela");
		//O printf também pode ser usado
		System.out.printf("Mensagem que será impressa!\n");

		//Imprimindo valores das variáveis
		System.out.println("Nome: "+nome+" mede "+altura+" cm");
		//Usando o printf
		System.out.printf("Nome: %s mede %d cm\n",nome,altura);
	}
}
