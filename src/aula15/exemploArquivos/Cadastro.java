package aula15.exemploArquivos;

import java.io.*;

public class Cadastro {
	public static void main(String[] args) {
		Pessoa[] lista = new Pessoa[10];
		int contPessoa=0;
		lista[contPessoa++] = new Pessoa("Jonas","Silva");
		lista[contPessoa++] = new Pessoa("Ana","Souza");
		lista[contPessoa++] = new Pessoa("Carlos","Silva");
		//Arquivos
		File arquivo = new File("./arquivo.dbf");
		try {
			ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
			//Escrever a lista dentro do arquivo
			escrita.writeObject(lista);
			//Liberando os recursos
			escrita.close();
			System.out.println("Deu tudo certo!!");
		}
		catch (FileNotFoundException e){
			System.out.println("Arquivo "+arquivo.getName()+" não foi encontrado");

		}
		catch (IOException e){
			System.out.println("Erro de entrada e saída");
		}
	}
}
