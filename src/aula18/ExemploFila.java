package aula18;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("Elemento 1");
		fila.add("Elemento 2");
		fila.add("Elemento 3");
		fila.add("Elemento 4");
		fila.add("Elemento 5");
		fila.add("Elemento 6");
		System.out.println(fila);
		System.out.println("Qual o próximo da fila: "+fila.peek());
		System.out.println("Atendendo o elemento "+fila.remove());
		System.out.println(fila);
	}
}
