package aula13.exercicios.exercicio05;

import java.util.Random;

public class ContaCorrente {
	String identificador;
	String titular;
	float saldo;
	float limite;

	ContaCorrente(String titular, float limiteInicial){
		this.titular = titular;
		saldo = 0;
		limite = limiteInicial;
		geraIdentificador();
	}

	void geraIdentificador(){
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
		if(valor<=saldo+limite){
			saldo-=valor;
			return true;
		}
		return false;
	}

	String verificaSaldo(){
		String retorno = "Seu saldo é de R$"+String.format("%.2f",saldo);
		if(saldo<0){
			retorno+="\nSeu limite disponível é R$ "+String.format("%.2f",saldo+limite);
		}
		else{
			retorno+="\nSeu limite disponível é R$ "+String.format("%.2f",limite);
		}
		return retorno;
	}
}
