package aula18;

import java.util.HashSet;

public class ExemploHashSet {
	public static void main(String[] args) {
		HashSet<String> lista = new HashSet<>();
		System.out.println("Adicionando o 'Elemento 1': "+lista.add("Elemento 1"));
		System.out.println("Adicionando o 'Elemento 2': "+lista.add("Elemento 2"));
		System.out.println("Adicionando o 'Elemento 3': "+lista.add("Elemento 3"));
		System.out.println("Adicionando o 'Elemento 1': "+lista.add("Elemento 1"));
		System.out.println("Adicionando o 'Elemento 4': "+lista.add("Elemento 4"));
		System.out.println("Adicionando o 'Elemento 5': "+lista.add("Elemento 5"));
	}
}
