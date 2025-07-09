package aula18;

import java.util.Stack;

public class ExemploPilha {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		//Adicionar um elemento a pilha
		pilha.push("Elemento 1");
		pilha.push("Elemento 2");
		pilha.push("Elemento 3");
		pilha.push("Elemento 4");
		pilha.push("Elemento 5");
		//Consultar o topo da pilha
		System.out.println("O elemento no topo da pilha "+pilha.peek());
		System.out.println(pilha);
		//Removendo um elemento da pilha
		System.out.println(pilha.pop());
		System.out.println(pilha);
	}
}
