package aula17;

public class Teste {
	public static void main(String[] args) {
		Lista l1 = new Lista(2);
		l1.adiciona("item 1");
		//l1.adiciona("item 2");
		l1.adiciona("item 3");
		l1.adiciona("item 4");
		l1.adiciona("item 5");
		System.out.println(l1);
		//System.out.println("Qual a capacidade máxima atual: "+l1.obterTamanho());
		try {
			System.out.println("Elemento na posição -1 da lista"+l1.obter(-1));
		}
		catch (IllegalArgumentException e){
			System.out.println("Tentou acessar uma posição inválida");
		}
		try {
			System.out.println("Elemento na posição 1 da lista " + l1.obter(1));
		}
		catch (IllegalArgumentException e){
			System.out.println("Tentou acessar uma posição inválida");
		}
		System.out.println("Qual a posição do elemento 'item 4': "+l1.posicaoDe("item 4"));
		System.out.println("Qual a posição do elemento 'item teste': "+l1.posicaoDe("item teste"));
		System.out.println(l1);
		l1.adiciona(1,"item 2");
		System.out.println(l1);
		//System.out.println("Qual a capacidade máxima atual: "+l1.obterTamanho());
		System.out.println("Apagando o elemento da posição 2: "+l1.remove(2));
		System.out.println(l1);
	}
}
