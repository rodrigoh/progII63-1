package aula05.exercicios;

import java.util.Scanner;

/**
 * Uma loja está levantando o valor total de todas as mercadorias em
 * estoque. Escreva um algoritmo que permita a entrada das seguintes
 * informações:
 * a) Número total de mercadorias no estoque (quantidade total).
 * b) Valor de cada mercadoria.
 * Ao final imprimir o valor total em estoque e a média de valor das
 * mercadorias
 *
 * O mesmo exercício anterior, mas agora não será informado o número
 * de mercadorias em estoque. Então o funcionamento deverá ser da
 * seguinte forma: ler o valor da mercadoria e perguntar
 * “MAIS MERCADORIAS (S/N)?”. Ao final, imprimir o valor total
 * em estoque e a média de valor das mercadorias em estoque.
 */
public class Ex15_16 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float somaTotal = 0;
		int cont = 0;
		char resposta='s';
		while(resposta == 's'){
			System.out.print("Qual o valor do "+(cont+1)+"° produto: ");
			float valor = ler.nextFloat();
			somaTotal+=valor;
			cont++;
			System.out.print("Tem mais produtos (s - sim / n - não): ");
			resposta = ler.next().toLowerCase().charAt(0);
		}
		float valorMedio = somaTotal/cont;
		System.out.printf("O valor total do estoque é R$%.2f e o " +
						"valor médio dos itens é R$%.2f\n",somaTotal,valorMedio);
	}
}
