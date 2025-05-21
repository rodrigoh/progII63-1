package aula11.exemploCaneta;

public class Caneta {
	String fabricante;
	String cor;
	int quantidadeTinta;

	void escrever(String texto){
		if(quantidadeTinta>0) {
			System.out.println(texto);
			quantidadeTinta--;
		}
	}
}
