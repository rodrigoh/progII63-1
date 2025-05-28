package aula13.exemploStatic;

public class Principal {
	public static void main(String[] args) {
		ContaPoupanca cp1 = new ContaPoupanca("Jonas",100);
		ContaPoupanca cp2 = new ContaPoupanca("Ana",50);
		cp1.nomeBanco = "Banco teste";
		System.out.println(cp1.nomeBanco);
		System.out.println(cp2.nomeBanco);
		//Posso acessar um atributo diretamente da classe
		ContaPoupanca.nomeBanco = "Novo nome";

		System.out.println(cp1.nomeBanco);
		System.out.println(cp2.nomeBanco);
	}
}
