package aula06.exercicios;

import java.util.Scanner;

/**
 * Ler dois vetores, A e B com um número variável de conteúdo (números) (no máximo 10).
 * O programa deve solicitar antes da leitura dos vetores a quantidade de dados a serem
 * lidos (1 a 10), os dois vetores terão o mesmo número de elementos. Gerar um terceiro
 * vetor chamado Soma (de no máximo 10 elementos) que seja a soma dos dados do vetor
 * A com os do vetor B.
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual deve ser o tamanho dos vetores 1-10: ");
		int tamanho = ler.nextInt();
		while (tamanho<1 || tamanho>10){
			System.out.println("Eu disse entre 1 e 10: ");
			tamanho = ler.nextInt();
		}
		int[] va = new int[tamanho];
		int[] vb = new int[tamanho];
		int[] soma = new int[tamanho];
		for(int i=0;i<va.length;i++){
			System.out.print("va["+i+"]: ");
			va[i] = ler.nextInt();
		}
		for(int i=0;i<vb.length;i++){
			System.out.print("vb["+i+"]: ");
			vb[i] = ler.nextInt();
		}
		for(int i=0;i<tamanho;i++){
			soma[i] = va[i]+vb[i];
			System.out.printf("%d + %d = %d\n",va[i],vb[i],soma[i]);
		}
	}
}
