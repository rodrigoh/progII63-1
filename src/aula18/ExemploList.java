package aula18;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		lista.add("Elemento 1");
		lista.add("Elemento 3");
		lista.add("Elemento 4");
		lista.add("Elemento 5");
		lista.add(1,"Elemento 2");
		System.out.println(lista);
		System.out.println("A lista contém o elemento 'Elemento 4' "+(lista.contains("Elemento 4")?"Sim":"Não"));
		System.out.println("O tamanho atual da lista "+lista.size());
		System.out.println("Apagando o elemento da posição 2 "+lista.remove(2));


	}
}
