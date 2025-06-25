package aula17;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade){
		elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	/**
	 * Adicionar um elemento no final da lista
	 * @param elemento elemento a ser adicionado
	 */
	public void adiciona(T elemento){
		aumentaCapacidade();
		elementos[tamanho] = elemento;
		tamanho++;
	}

	/**
	 * Adiciona um elemento em qualquer posição da lista
	 * @param posicao posição do elemento
	 * @param elemento elemento que deseja adicionar
	 */
	public void adiciona(int posicao, T elemento){
		if(posicao<0 || posicao>=tamanho){
			throw new IllegalArgumentException("Posição "+posicao+" não é válida");
		}
		aumentaCapacidade();
		for(int i=tamanho-1;i>=posicao;i--){
			elementos[i+1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
	}

//	public int obterTamanho(){
//		return elementos.length;
//	}

	private void aumentaCapacidade(){
		if(tamanho == elementos.length){
			T[] aux = (T[]) new Object[tamanho*2];
			for (int i = 0; i < tamanho; i++) {
				aux[i] = elementos[i];
			}
			elementos = aux;
		}
	}



//	public void adiciona(int posicao, String elemento){
//		if(posicao<0 || posicao>=tamanho){
//			throw new IllegalArgumentException("Posição "+posicao+" não é válida");
//		}
//		String[] aux = new String[tamanho+1];
//		int j=0;
//		for (int i = 0; i < tamanho; i++) {
//			if(i==posicao){
//				aux[j++] = elemento;
//				i++;
//			}
//			else{
//				aux[j++] = elementos[i];
//			}
//			elementos = aux;
//			tamanho++;
//		}
//	}

	/**
	 * Obtém um elemento da lista
	 * @param posicao posição do elemento desejado
	 * @return o elemento ou uma IllegalArgumentException caso a posição seja inválida
	 */
	public T obter(int posicao){
		if(posicao<0 || posicao>=tamanho){
			throw new IllegalArgumentException("Posição "+posicao+" não é válida");
		}
		return elementos[posicao];
	}
	/**
	 * Retorna a posição de elemento na lista
	 * @param elemento elemento que estamos buscando
	 * @return posição do elemento ou -1 se ele não existir
	 */
	public int posicaoDe(T elemento){
		for (int i = 0; i < tamanho; i++) {
			if(elemento.equals(elementos[i]))
				return i;
		}
		return -1;
	}
	//TODO método para obter a ultimaPosicaoDe
	//TODO método para obter o tamanho da lista
	//TODO método para remover um elemento pelo elemento
	//TODO construtor que não recebe a capacidade inicial e cria com 10
	//TODO método para verificar se um elemento existe (boolean)
	//TODO método para apagar todos os elementos da lista
	//TODO verificar se a lista está vazia

	/**
	 * Remove um elemento de determinada posição
	 * @param posicao posição do elemento que deseja remover
	 * @return o elemento removido
	 */
	public T remove(int posicao){
		if(posicao<0 || posicao>=tamanho){
			throw new IllegalArgumentException("Posição "+posicao+" não é válida");
		}
		T copia = elementos[posicao];
		for (int i = posicao; i < tamanho-1; i++) {
			elementos[i] = elementos[i+1];
		}
		tamanho--;
		return copia;
	}

	/**
	 *
	 * @return Se a lista vazia [] se tiver elementos [1, 2, 3, 4, 5, 6]
	 */
	@Override
	public String toString(){
		String retorno = "[";
		if(tamanho>0){
			for (int i = 0; i < tamanho-1; i++) {
				retorno+=elementos[i]+", ";
			}
			retorno+=elementos[tamanho-1];
		}
		return retorno+"]";
	}
}
