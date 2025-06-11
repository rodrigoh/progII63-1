package aula15.exemploArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LendoArquivo {
	public static void main(String[] args) {
		Pessoa[] lista = new Pessoa[10];
		int contPessoa=0;
		//Arquivos
		File arquivo = new File("./arquivo.dbf");
		try{
			ObjectInputStream leitura = new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
			//Ler os objetos do arquivo
			lista = (Pessoa[]) leitura.readObject();
			//Contando quantas pessoas tem na lista
			while(lista[contPessoa]!=null)
				contPessoa++;
			//Listando as informações
			for (int i = 0; i < contPessoa; i++) {
				System.out.println(lista[i]);
			}
		}
		catch (IOException e){
			System.out.println("Erro de entrada e saída");
		}
		catch (ClassNotFoundException e){
			System.out.println("Classe não encontrada");
		}
	}
}
