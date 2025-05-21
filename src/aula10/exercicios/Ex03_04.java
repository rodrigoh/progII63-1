package aula10.exercicios;

import java.util.Random;

public class Ex03_04 {
	public static int dado(){
		Random aleatorio = new Random();
		return aleatorio.nextInt(6);
	}

	public static void main(String[] args) {
		int nLancamentos = 1000000;
		int[] lancamentos = new int[6];
		for (int i = 0; i < nLancamentos; i++) {
			int valor = dado();
			lancamentos[valor]++;
		}
		for (int i = 0; i < 6; i++) {
			double percentual = lancamentos[i]/(float) nLancamentos*100;
			System.out.printf("A face %d do dado foi sorteada %d vezes o que " +
							"representa %.2f%% do total\n",i+1,lancamentos[i],percentual);
		}
	}
}
