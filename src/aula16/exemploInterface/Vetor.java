package aula16.exemploInterface;

public class Vetor implements Lista{

	private String[] elementos = new String[10];
	private int tamanho=0;

	@Override
	public void adiciona(String elemento) {
		elementos[tamanho] = elemento;
		tamanho++;
	}

	@Override
	public void remove() {
		tamanho--;
	}

	public int tamanho(){
		return tamanho;
	}

	//[]
	//[1, 2, 3, 4, 5]'
	@Override
	public String toString(){
		String retorno = "[";
		if(tamanho>0){
			for (int i = 0; i < tamanho-1; i++) {
				retorno+=elementos[i]+", ";
			}
			retorno += elementos[tamanho-1];
		}
		return retorno+"]";
	}

}
