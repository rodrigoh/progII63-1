package aula16.conta;

import java.io.Serializable;
import java.util.Random;

/**
 * Classe que representa uma conta bancária
 * @since 1.0
 * @author Rodrigo Henrich
 * @version 1.0
 */
public class Conta implements Serializable {

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

	/**
	 * Método que valida o acesso a minha conta
	 * @param identificador valor do identificador da conta
	 * @param senha senha de acesso
	 * @return boolean true caso os dados sejam válidos e false caso não sejam
	 */
	public boolean validaAcesso(String identificador, String senha){
		return this.identificador.equals(identificador) && this.senha.equals(senha);
	}

	/**
	 * Método gera um id único para minha conta
	 * @return uma string contendo o novo ID
	 * @see google
	 */
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
}
