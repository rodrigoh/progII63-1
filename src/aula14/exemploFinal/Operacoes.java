package aula14.exemploFinal;

public class Operacoes {
	//
	//public -> para ter acesso global
	//static -> para existir independente da criação de instância
	//final -> para não ter seu valor alterado
	public static final double E = 2.71828;
	// como é em C: const double E = 2.71828;
	//Criando um atributo final ele não pode ser modificado e precisa de um valor
	final int valor=10;
	final int valorDois;

	public Operacoes(){
		//Se a variável final não for inicializada, devo fazer isso no construtor
		valorDois = 5;
	}

}
