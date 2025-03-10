package aula02;

public class ExemplosMath {
	public static void main(String[] args) {
		//Constante PI
		float pi = (float) Math.PI;
		//Potência
		int base = 5;
		int expoente = 2;
		double quadrado = Math.pow(base, expoente);

		float valor = (float) 5.5;
		valor = 5.5f;

		valor = (float)6.3;

		float raio = 5;

		float area = (float) Math.PI*raio*raio;

		area = (float) (Math.PI*Math.pow(raio,2));
	}
}
