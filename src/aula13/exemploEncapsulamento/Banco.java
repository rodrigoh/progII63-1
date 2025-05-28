package aula13.exemploEncapsulamento;

public class Banco {
	public static void main(String[] args) {
		ContaPoupanca cp1 = new ContaPoupanca("jonas",100);
		//cp1.saldo = 0;
		System.out.println(cp1.getIdentificador());
		//cp1.geraIdentificador();
		//System.out.println(cp1.getIdentificador());
	}
}
