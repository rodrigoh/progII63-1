package aula16.exemploInterface;

public class Teste {
	public static void main(String[] args) {
		Vetor v1 = new Vetor();
		v1.adiciona("Item 1");
		v1.adiciona("Item 2");
		v1.adiciona("Item 3");
		v1.adiciona("Item 4");
		v1.adiciona("Item 5");
		System.out.println(v1);
		v1.remove();
		System.out.println(v1);
		System.out.println("O tamanho da lista é "+v1.tamanho());

		Lista l1 = new Vetor();
		l1.adiciona("Item 1");
		l1.adiciona("Item 2");
		//O método tamanho() só existe em vetor, portando não está disponível
		//l1.tamanho();
	}
}
