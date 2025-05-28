package aula13.exemploEncapsulamento;

public class Teste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Jonas");
		p1.setAltura(180);
		p1.seteMail("jonas@terra.com.br");
		p1.setEndereco("Endereço do jonas");
		System.out.println("Nome: "+p1.getNome());
	}
}
