package aula14.exemploPolimorfismo.exOverride;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String titular, String senha, float deposito) {
		super(titular, senha);
		saldo = deposito;
	}
}
