package aula11.exemploAluno;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno a1 = new Aluno();
		System.out.print("Nome: ");
		a1.nome = ler.next();
		System.out.println("Quais as notas do "+a1.nome);
		System.out.print("Nota 1: ");
		a1.notaUm = ler.nextFloat();
		System.out.print("Nota 2: ");
		a1.notaDois = ler.nextFloat();
		System.out.print("Nota 3: ");
		a1.notaTres = ler.nextFloat();

		a1.calculaMedia();
		System.out.println("Com estas notas o "+a1.nome+" está "+a1.retornaStatus());

	}
}
