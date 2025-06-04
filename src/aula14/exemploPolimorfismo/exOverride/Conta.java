package aula14.exemploPolimorfismo.exOverride;

import java.util.Random;

public class Conta {

	private String titular;
	protected float saldo;
	private String identificador;
	private String senha;

	public Conta(String titular, String senha){
		this.titular = titular;
		this.senha = senha;
		identificador = geraId();
	}

	public void depositar(float valor){
		saldo+=valor;
	}

	public boolean validaAcesso(String identificador, String senha){
		return this.identificador.equals(identificador) && this.senha.equals(senha);
	}

	private String geraId(){
		Random aleatorio = new Random();
		String id = "";
		for(int i=0;i<5;i++){
			id+= (char) aleatorio.nextInt(65,90);
		}
		id+=aleatorio.nextInt(1000,9999);
		return id;
	}

	public String getIdentificador(){
		return identificador;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public boolean sacar(float valor){
		if(valor<=saldo){
			saldo-=valor;
			return true;
		}
		return false;
	}

	public String verificaSaldo(){
		return String.format("Seu saldo é de R$%.2f",saldo);
	}
}
