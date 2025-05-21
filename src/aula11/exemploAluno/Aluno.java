package aula11.exemploAluno;

public class Aluno {
	String nome;
	float notaUm;
	float notaDois;
	float notaTres;
	float media;

	void calculaMedia(){
		media = (notaUm+notaDois+notaTres)/3;
	}

	String retornaStatus(){
		String status;
		if(media>=8)
			status = "Aprovado";
		else if(media>3)
			status = "Recuperação";
		else
			status = "Reprovado";
		return status;
	}

//	String retornaStatus(){
//		if(media>=8)
//			return "Aprovado";
//		else if(media>3)
//			return "Recuperação";
//		else
//			return "Reprovado";
//	}

}
