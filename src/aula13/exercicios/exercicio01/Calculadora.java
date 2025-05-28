package aula13.exercicios.exercicio01;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Operacoes op = new Operacoes();
		char opc;
		do{
			System.out.println("Escolha uma operação");
			System.out.println("+ soma");
			System.out.println("- subtração");
			System.out.println("* para multiplicação");
			System.out.println("/ divisão");
			System.out.println("^ potenciação");
			System.out.println("s sair");
			opc = ler.next().toLowerCase().charAt(0);
			if(opc!='s'){
				System.out.print("Entre com um valor para n1: ");
				op.n1 = ler.nextFloat();
				System.out.print("Entre com um valor para n2: ");
				op.n2 = ler.nextFloat();
			}
			switch (opc){
				case '+'-> System.out.println(op.n1+"+"+op.n2+"="+op.soma());
				case '-'-> System.out.println(op.n1+"-"+op.n2+"="+op.subtrai());
				case '*'-> System.out.println(op.n1+"*"+op.n2+"="+op.multiplica());
				case '^'-> System.out.println(op.n1+"^"+op.n2+"="+op.potencia());
				case '/'->{
					if(op.n2!=0)
						System.out.println(op.n1+"/"+op.n2+"="+op.divive());
					else
						System.out.println("Não é possível dividir por zero");
				}
			}
		}
		while (opc!='s');
	}
}
