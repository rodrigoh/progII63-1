package aula13;

import aula13.exemploModificadores.Pessoa;

public class Teste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		//Aqui só é possível acessar o e-mail que é um atributo público de Pessoa
		p1.eMail = "teste@gmail.com";
	}
}
