package aula13.exercicios.exercicio04;

public class Pessoa {
	String nome;
	String eMail;
	String telefone;
	String endereco;

	String obterInfo(){
		String info = "Nome: "+nome;
		info+="\nE-mail: "+eMail;
		info+="\nTelefone: "+telefone;
		info+="\nEndereço: "+endereco;
		return info;
	}
}
