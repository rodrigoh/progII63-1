package aula05;

import java.util.Random;

public class ExemploRandom {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		int numero = aleatorio.nextInt();
		System.out.println(numero);
		numero = aleatorio.nextInt(100);
		System.out.println(numero);
		numero = aleatorio.nextInt(2,20);
		System.out.println(numero);
		boolean teste = aleatorio.nextBoolean();
		//teste?valor_se_verdadeiro:valor_se_falso
		System.out.println("Agora vale? "+(teste?"cara":"coroa"));
		//Gerando uma letra aleatória
		numero = aleatorio.nextInt(65,97);
		char letra = (char) numero;
		System.out.println(letra);
		String palavra = "casa";
		String nova = palavra;
	}
}
