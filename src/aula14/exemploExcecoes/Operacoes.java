package aula14.exemploExcecoes;

public class Operacoes {

	public float divide(int n1, int n2) throws ArithmeticException{
		if(n2==0)
			throw new ArithmeticException("Não é possível dividir por zero");
		return (float) n1/n2;
	}
}
