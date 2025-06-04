package aula14.exemploPolimorfismo;

public class Operacoes {

	public String soma(String str1, String str2){
		return str1+str2;
	}

	public int soma(int n1, int n2){
		return n1+n2;
	}

	public int soma(int[] vetor){
		int soma=0;
		for(int i=0;i<vetor.length;i++)
			soma+=vetor[i];
		return soma;
	}
}
