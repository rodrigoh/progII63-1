package aula02.exercicios;

import java.util.Scanner;

/**
 * Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
 * Sabendo-se que o preço do combustível é de R$ 4,15, escreva um programa para
 * ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do
 * dia, o número de litros de combustível gasto e o valor total (R$) recebido dos
 * passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido)
 * do dia.
 */
public class Ex14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual a km no inicio do dia: ");
		int kmInicial = ler.nextInt();
		System.out.print("Qual a km no final do dia: ");
		int kmFinal = ler.nextInt();
		System.out.print("Qual a quantidade de combustível usada: ");
		float quantLitros = ler.nextFloat();
		System.out.print("Quanto recebeu dos passageiros: ");
		float valorBruto = ler.nextFloat();
		float autonomia = (kmFinal-kmInicial)/quantLitros;
		//4.15f = (float) 4.15
		float valorLiquido = valorBruto-quantLitros*4.15f;

		System.out.printf("Seu veículo tem um consumo médio de %.2f km/l\n",autonomia);
		System.out.printf("Seu lucro foi de R$%.2f\n",valorLiquido);

	}
}
