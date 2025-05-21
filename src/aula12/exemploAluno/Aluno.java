package aula12.exemploAluno;

public class Aluno {
	String nome;
	String sobrenome;
	float n1;
	float n2;
	float n3;
	float media;

	public Aluno(){

	}

	public Aluno(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Aluno(String nome, String sobrenome, float n1, float n2, float n3){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	void calculaMedia(){
		media = (n1+n2+n3)/3;
	}

	String verificaStatus(){
		if(media>=8)
			return "Aprovado";
		else if(media>=5)
			return "Recuperação";
		else
			return "Reprovado";
	}

//	String verificaStatus(){
//		String retorno = "Reprovado";
//		if(media>=8)
//			retorno = "Aprovado";
//		else if(media>=5)
//			retorno =  "Recuperação";
//		return  retorno;
//	}

	String obterInformacoes(){
		String info = "Nome: "+nome+" "+sobrenome;
		info+= "\nN1: "+String.format("%.2f",n1);
		info+= "\nN2: "+String.format("%.2f",n2);
		info+= "\nN3: "+String.format("%.2f",n3);
		info+= "\nMédia: "+String.format("%.2f",media);
		info+="\nEstá: "+verificaStatus();
		return info;
	}

	void alteraNome(String nome){
		this.nome = nome;
	}
}
