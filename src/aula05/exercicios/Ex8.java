package aula05.exercicios;

import java.util.Scanner;

/**
 * Escreva um algoritmo para pedir que o usuário digite números positivos, ou seja,
 * ele pode digitar quantos números positivos ele quiser. Para parar de digitar números,
 * ele deve digitar -1. Após o usuário digitar -1, o programa deve escrever na tela
 * quantos números o usuário digitou (a quantidade de números lidos) e a soma total
 * dos números que ele digitou.
 */
public class Ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0;
		int cont = 0;
		int numero;
		do{
			System.out.print("Digite o "+(cont+1)+"° número e -1 para encerrar: ");
			numero = ler.nextInt();
			if(numero>0){
				soma+=numero;
				cont++;
			}
		}
		while (numero!=-1);
		System.out.println("Foram digitados "+cont+" números que somados valem "+soma);
	}
}
