package aula11.exemploCaneta;

public class Exemplo02 {
	public static void main(String[] args) {
		Caneta canetaUm = new Caneta();
		canetaUm.quantidadeTinta = 10;
		for (int i = 0; i < 15; i++) {
			canetaUm.escrever("Escrevendo a linha "+(i+1));
		}
	}
}
