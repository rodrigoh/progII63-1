package aula13.exemploEncapsulamento;

import java.util.Random;

public class ContaPoupanca {
	private String identificador;
	private String titular;
	private float saldo;

	ContaPoupanca(String titular, float deposito){
		this.titular = titular;
		saldo = deposito;
		geraIdentificador();
	}

	String getIdentificador(){
		return identificador;
	}

	private void geraIdentificador(){
		Random aleatorio = new Random();
		String identificador = "";
		for(int i=0;i<5;i++){
			identificador+=(char) aleatorio.nextInt(65,90);
		}
		identificador+=aleatorio.nextInt(100000000,999999999);
		this.identificador = identificador;
	}

	void depositar(float valor){
		saldo+=valor;
	}

	boolean sacar(float valor){
		if(valor<=saldo){
			saldo-=valor;
			return true;
		}
		return false;
	}

	String verificaSaldo(){
		return "Seu saldo é de R$"+String.format("%.2f",saldo);
	}
}
