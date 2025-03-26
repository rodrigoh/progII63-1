package aula04.repeticao;

public class ExemploFor {
	public static void main(String[] args) {
		//for(inicialização; teste; passo)
		for (int i = 0; i < 10; i++)
			System.out.print(i + " ");

		System.out.println("\nUsando sem inicializar");
		int i = 10;
		for (; i > 0; i--)
			System.out.print(i + " ");

		System.out.println("\nRemovendo o passo");
		for (i = 0; i < 20; ) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println("\nUsando mais de um contador");
		for (int j = 0, t = 9; j < 10 && t > 0; j++, t--)
			System.out.println("j = " + j + ", t = " + t);

		char letra = 'a';
		for (; letra <= 'z';letra++){
			System.out.print(letra+" ");
		}
	}
}
