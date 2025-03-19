package aula04.repeticao;

import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		int i = 0;
		while(i<10){
			System.out.print(i+" ");
			i++;
//			i+=1;
//			i = i + 1;
		}
		System.out.println("\nOutro exemplo...");
		char resposta = 's';
		while(resposta=='s'){
			System.out.print("Continuar s - sim, n - não: ");
			resposta = new Scanner(System.in).next().charAt(0);
		}
	}
}
