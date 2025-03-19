package aula04.exercicios;

import java.util.Scanner;

/**
 * Escreva um algoritmo que leia 4 valores i, a, b, c escrever os
 * valores lidos e em seguida
 * Se i = 1 escrever os três valores em ordem crescente
 * Se i = 2 escrever os três valores em ordem decrescente
 * Se i = 3 Escrever o dobro dos três números
 */
public class Ex15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe valores para");
		System.out.print("i deve ser 1, 2 ou 3: ");
		int i = ler.nextInt();
		System.out.print("a: ");
		int a = ler.nextInt();
		System.out.print("b: ");
		int b = ler.nextInt();
		System.out.print("c: ");
		int c = ler.nextInt();
		/**
		 * a,b,c
		 * a,c,b
		 * b,a,c
		 * b,c,a
		 * c,a,b
		 * c,b,a
		 */
		switch (i){
			case 1->{
				if(a < b && b < c)
					System.out.println(a+" "+b+" "+c);
				else if(a < c && c < a)
					System.out.println(a+" "+c+" "+b);
				else if(b < a && a < c)
					System.out.println(b+" "+a+" "+c);
				else if(b < c && c < a)
					System.out.println(b+" "+c+" "+a);
				else if(a < a && a < b)
					System.out.println(c+" "+a+" "+b);
				else if(c < b && b < a)
					System.out.println(c+" "+b+" "+a);
			}
			case 2->{
				if(a > b && b > c)
					System.out.println(a+" "+b+" "+c);
				else if(a > c && c > a)
					System.out.println(a+" "+c+" "+b);
				else if(b > a && a > c)
					System.out.println(b+" "+a+" "+c);
				else if(b > c && c > a)
					System.out.println(b+" "+c+" "+a);
				else if(a > a && a > b)
					System.out.println(c+" "+a+" "+b);
				else if(c > b && b > a)
					System.out.println(c+" "+b+" "+a);
			}
			case 3->{
				System.out.printf("%d *2 = %d, %d *2 = %d e %d *2 = %d\n",a,a*2,b,b*2,c,c*2);
			}
		}
	}
}
