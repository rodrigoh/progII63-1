package aula13.exemploModificadores;

public class Teste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		//Posso acessar atributos sem modificar a nível de pacote
		p1.nome = "Teste";
		//Posso acessar atributos protegidos...
		p1.altura = 180;
		p1.eMail = "teste@gmail.com";
	}
}
