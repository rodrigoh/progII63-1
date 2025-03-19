package aula03;

import java.util.Scanner;

public class ExemploIfString {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual seu usuário: ");
		String usuario = ler.next();
		System.out.print("Qual sua senha: ");
		String senha = ler.next();
		//equalsIgnoreCase();
		if(usuario.equals("admin") && senha.equals("123456"))
			System.out.println("Bem vindo ao sistema");
		else
			System.out.println("Erro ao acessar");
	}
}
