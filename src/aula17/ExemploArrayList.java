package aula17;

import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		//Deve ser um objeto: Float, Double, String, Pessoa, Integer
		//Não pode ser tipo primitivo: int, float, double, char
		ArrayList<String> lista = new ArrayList<>();
		//Adicionar um elemento na lista
		lista.add("item 1");
		//lista.add("item 2");
		lista.add("item 3");
		lista.add("item 4");
		lista.add("item 3");
		lista.add("item 5");
		System.out.println(lista);
		lista.add(1,"item 2");
		//Adiciona em qualquer posição
		System.out.println(lista);
		//Obter o índice de um elemento
		System.out.println("A posição do 'item 2' na lista "+lista.indexOf("item 2"));
		System.out.println("A posição do 'item teste' na lista "+lista.indexOf("item teste"));
		//Obter o índice da última ocorrência de determinado elemento
		System.out.println("Qual a posição da primeira instância do 'item 3': "+lista.indexOf("item 3"));
		System.out.println("Qual a posição da última instância do 'item 3': "+lista.lastIndexOf("item 3"));
		//Obter um elemento
		System.out.println("Qual o elemento da posição 2 "+lista.get(2));
		//A lista contém determinado elemento
		System.out.println("A lista tem o elemento 'item 4': "+(lista.contains("item 4")?"Sim":"Não"));
		System.out.println("A lista tem o elemento 'item teste': "+(lista.contains("item teste")?"Sim":"Não"));
		//Remover um elemento pela posição
		System.out.println("Apagando o elemento da posição 2 "+lista.remove(2));
		//Remover o elemento pelo elemento
		System.out.println("Apagar elemento 'item 2': "+(lista.remove("item 2")?"OK":"Erro"));
		System.out.println(lista);
		//Obter o tamanho atual da lista
		System.out.println("A lista tem "+lista.size()+" elementos");
		//Verificando se a lista está vazia
		System.out.println("A lista está vazia? "+(lista.isEmpty()?"Sim":"Não"));
		//Apagar todos os elementos
		lista.clear();
		System.out.println("A lista está vazia? "+(lista.isEmpty()?"Sim":"Não"));
		System.out.println(lista);

	}
}
