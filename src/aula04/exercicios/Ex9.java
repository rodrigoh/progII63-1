package aula04.exercicios;

import java.util.Scanner;

/*
9) Receba três valores fornecidos pelo usuário que representarão os lados
de um triângulo.
Classifique esse triângulo como:
a) Equilátero: três lados iguais.
b) Isósceles: dois lados iguais.
c) Escaleno: três lados diferentes.
Lembre-se de que, para formar um triângulo, nenhum dos lados pode ser
igual a zero,
um lado não pode ser maior do que a soma dos outros dois.

 */
public class Ex9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com as medidas do triângulo");
		System.out.print("l1: ");
		float l1 = ler.nextFloat();
		System.out.print("l2: ");
		float l2 = ler.nextFloat();
		System.out.print("l3: ");
		float l3 = ler.nextFloat();

		if(l1==0 || l2==0 || l3==0 && l1>l2+l3 || l2>l1+l3 || l3>l1+l2)
			System.out.println("As medidas não formam triângulo");
		else if(l1==l2 && l2==l3)
			System.out.println("As medidas formam um triângulo equilátero");
		else if(l1==l2 || l1==l3 || l2==l3)
			System.out.println("As medidas formam um triângulo isósceles");
		else
			System.out.println("As medidas formam um triângulo escaleno");
	}
}
