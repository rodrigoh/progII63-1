package aula13.exercicios.exercicio04;

import java.util.Scanner;

public class Cadastro {
	static String leString(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextLine();
	}

	public static void main(String[] args) {
		Pessoa[] lista = new Pessoa[10];
		int contP = 0;
		char opc;
		do{
			System.out.println("Selecione uma opção");
			System.out.println("c cadastrar pessoa");
			System.out.println("l listar as pessoas");
			System.out.println("p buscar pessoa");
			System.out.println("s sair");
			opc = leString("").toLowerCase().charAt(0);
			switch (opc){
				case 'c'->{
					if(contP<lista.length){
						lista[contP] = new Pessoa();
						lista[contP].nome = leString("Nome");
						lista[contP].eMail = leString("E-mail");
						lista[contP].telefone = leString("Telefone");
						lista[contP].endereco = leString("Endereço");
						contP++;
					}
					else
						System.out.println("A lista de pessoas está cheia");
				}
				case 'l'->{
					for(int i=0;i<contP;i++){
						System.out.println(lista[i].obterInfo());
					}
				}
				case 'p'->{
					String termo = leString("Termo de busca");
					for(int i=0;i<contP;i++){
						if(lista[i].nome.equalsIgnoreCase(termo)){
							System.out.println(lista[i].obterInfo());
						}
					}
				}
			}

		}
		while(opc!='s');
	}
}
