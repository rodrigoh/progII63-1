package aula14.exemploExcecoes;

public class Exemplo02 {
	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		try {
			System.out.println(op.divide(5, 0));
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
