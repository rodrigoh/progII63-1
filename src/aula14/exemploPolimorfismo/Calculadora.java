package aula14.exemploPolimorfismo;

public class Calculadora {
	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		System.out.println(op.soma(1,2));
		System.out.println(op.soma("Aula de ","programação"));
		int[] vetor = {1,2,3};
		System.out.println(op.soma(vetor));
	}
}
