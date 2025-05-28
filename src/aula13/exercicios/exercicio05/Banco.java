package aula13.exercicios.exercicio05;

public class Banco {
	public static void main(String[] args) {
		ContaPoupanca cp1 = new ContaPoupanca("Jonas",100);
		System.out.println("cp1:"+cp1.identificador);
		System.out.println("cp1 saldo "+cp1.verificaSaldo());

		ContaCorrente cc1 = new ContaCorrente("Ana",100);
		System.out.println("Realizando um saque de R$50,00 "+cc1.sacar(50));
		System.out.println("Saldo cc1: "+cc1.verificaSaldo());
	}
}
