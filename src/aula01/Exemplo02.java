package aula01;

import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args){
		//Criando uma instância da classe Scanner
		Scanner ler = new Scanner(System.in);
		//Para ler um número inteiro
		System.out.print("Digite um número inteiro: ");
		//scanf("%d",&numero);
		int numeroInteiro = ler.nextInt();
		System.out.printf("O número é %d\n",numeroInteiro);

		//Para ler um número real
		System.out.print("Entre com sua altura em metros: ");
		float altura = ler.nextFloat();

		//Reinicio a instância
		ler = new Scanner(System.in);
		//Lendo Strings do teclado
		System.out.print("Qual seu nome completo: ");
		String nome = ler.nextLine();

		System.out.printf("Seu nome é %s e sua altura é %.2f\n",nome,altura);
		System.out.println("Seu nome é "+nome+" e sua altura é "+altura);

		//Para ler um caractere do teclado
		System.out.print("Digite uma letra: ");
		char letra = ler.next().charAt(0);
	}
}
