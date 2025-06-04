package aula14.conta;

public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(String titular, String senha, float limite){
		super(titular,senha);
		this.limite = limite;
	}

	public boolean sacar(float valor){
		if(saldo+limite>=valor){
			saldo-=valor;
			return true;
		}
		return false;
	}

	public String verificaSaldo(){
		String info = String.format("Seu saldo é de %.2f",saldo);
		if(saldo<0)
			info+=String.format("Limite disponível %.2f",saldo+limite);
		else
			info+=String.format("Limite disponível %.2f",limite);
		return info;
	}


}
