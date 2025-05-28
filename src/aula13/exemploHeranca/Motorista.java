package aula13.exemploHeranca;

public class Motorista extends Funcionario{
	private String cnh;

	public Motorista(String nome, String sobrenome, int matricula,String cnh){
		super(nome,sobrenome,matricula);
		this.cnh = cnh;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
}
