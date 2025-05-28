package aula13.exemploEncapsulamento;

public class Pessoa {
	private String nome;
	private String eMail;
	private int altura;
	private String endereco;

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
