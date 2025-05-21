package aula12.exemploAluno;

import java.util.Scanner;

public class CadastroAluno {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Aluno aluno = new Aluno();
		System.out.print("Nome: ");
		String nome = ler.next();
		System.out.print("Sobrenome: ");
		String sobrenome = ler.next();
		Aluno aluno = new Aluno(nome,sobrenome);
		System.out.print("N1: ");
		aluno.n1 = ler.nextFloat();
		System.out.print("N2: ");
		aluno.n2 = ler.nextFloat();
		System.out.print("N3: ");
		aluno.n3 = ler.nextFloat();
		aluno.calculaMedia();
		System.out.println(aluno.obterInformacoes());
		//Usando o construtor vazio
		Aluno alunoDois = new Aluno();
		//Usando o construtor passando nome e sobrenome
		Aluno alunoTres = new Aluno("Jonas","Silva");
		//Usando o construtor com todas as informações
		Aluno alunoQuatro = new Aluno("Jonas","Silva",8,7,9);
	}
}
