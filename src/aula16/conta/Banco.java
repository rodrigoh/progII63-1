package aula16.conta;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {

	public static ContaCorrente[] leArquivoCC(File arquivo){
		if(!arquivo.exists())
			System.out.println("O arquivo ainda não existe");
		try{
			ContaCorrente[] lista;
			ObjectInputStream leitura = new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
			lista = (ContaCorrente[]) leitura.readObject();
			return lista;
		}
		catch (IOException e) {
			System.out.println("Ocorreu um erro de leitura ou escrita");
		}
		catch (ClassNotFoundException e){
			System.out.println("Classe não encontrada");
		}
		return new ContaCorrente[20];
	}
	public static ContaPoupanca[] leArquivoCP(File arquivo){
		if(!arquivo.exists())
			System.out.println("O arquivo ainda não existe");
		try{
			ContaPoupanca[] lista;
			ObjectInputStream leitura = new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
			lista = (ContaPoupanca[]) leitura.readObject();
			return lista;
		}
		catch (IOException e) {
			System.out.println("Ocorreu um erro de leitura ou escrita");
		}
		catch (ClassNotFoundException e){
			System.out.println("Classe não encontrada");
		}
		return new ContaPoupanca[20];
	}

	public static void gravaArquivoContaCC(File arquivo, ContaCorrente[] lista){
		try{
			ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
			escrita.writeObject(lista);
			escrita.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}
		catch (IOException e) {
			System.out.println("Erro de entrada e saída");
		}
	}
	public static void gravaArquivoContaCP(File arquivo, ContaPoupanca[] lista){
		try{
			ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
			escrita.writeObject(lista);
			escrita.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}
		catch (IOException e) {
			System.out.println("Erro de entrada e saída");
		}
	}

	public static String leString(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextLine();
	}

	public static float leFloat(String mensagem){
		boolean okValido = false;
		float valor=0;
		do {
			try {
				System.out.print(mensagem + ": ");
				valor = new Scanner(System.in).nextFloat();
				okValido = true;
			}
			catch (InputMismatchException e) {
				System.out.println("O valor digitado não é válido");
				okValido = false;
			}
		}
		while (!okValido);
		return valor;
	}

	public static ContaCorrente acessaCC(ContaCorrente c1){
		String opc;
		System.out.println("Acessando a conta "+c1.getIdentificador());
		System.out.println("Bem vindo, "+c1.getTitular());
		do{
			System.out.println("Selecione uma opção");
			System.out.println("d - realizar um depósito");
			System.out.println("s - realizar um saque");
			System.out.println("v - verificar o saldo");
			System.out.println("a - alterar a senha");
			System.out.println("e - sair");
			opc = leString("").toLowerCase();
			switch (opc){
				case "d"->{
					float valor = leFloat("Qual valor deseja depositar");
					c1.depositar(valor);
					System.out.println("Depósito realizado!");
				}
				case "s"->{
					float valor = leFloat("Qual o valor do saque");
					if(c1.sacar(valor))
						System.out.println("Saque realizado");
					else
						System.out.println("Saldo mais limite insuficientes");
				}
				case "v"->System.out.println(c1.verificaSaldo());
				case "a"->{
					String senha = leString("Qual a nova senha");
					c1.setSenha(senha);
				}
			}
		}
		while(!opc.equals("e"));
		return c1;
	}

	public static ContaPoupanca acessaCP(ContaPoupanca c1){
		String opc;
		System.out.println("Acessando a conta "+c1.getIdentificador());
		System.out.println("Bem vindo, "+c1.getTitular());
		do{
			System.out.println("Selecione uma opção");
			System.out.println("d - realizar um depósito");
			System.out.println("s - realizar um saque");
			System.out.println("v - verificar o saldo");
			System.out.println("a - alterar a senha");
			System.out.println("e - sair");
			opc = leString("").toLowerCase();
			switch (opc){
				case "d"->{
					float valor = leFloat("Qual valor deseja depositar");
					c1.depositar(valor);
					System.out.println("Depósito realizado!");
				}
				case "s"->{
					float valor = leFloat("Qual o valor do saque");
					if(c1.sacar(valor))
						System.out.println("Saque realizado");
					else
						System.out.println("Saldo insuficiente");
				}
				case "v"->System.out.println(c1.verificaSaldo());
				case "a"->{
					String senha = leString("Qual a nova senha");
					c1.setSenha(senha);
				}
			}
		}
		while(!opc.equals("e"));
		return c1;
	}

	public static ContaCorrente cadastraCC(){
		String titular = leString("Qual o titular da conta");
		String senha = leString("Qual a senha");
		float limite = leFloat("Qual o limite inicial");
		ContaCorrente c1 = new ContaCorrente(titular,senha,limite);
		System.out.println("Conta cadastrada com o identificador "+c1.getIdentificador());
		return c1;
	}

	public static ContaPoupanca cadastraCP(){
		String titular = leString("Qual o titular da conta");
		String senha = leString("Qual a senha");
		float deposito = leFloat("Qual valor depositar");
		ContaPoupanca c1 = new ContaPoupanca(titular,senha,deposito);
		System.out.println("Conta cadastrada com o identificador "+c1.getIdentificador());
		return c1;
	}
	
	public static void main(String[] args) {
		File arquivoCC = new File("./arquivocc.dbf");
		File arquivoCP = new File("./arquivocp.dbf");
		//Ler os arquivos das contas
		ContaCorrente[] listaCC = leArquivoCC(arquivoCC);
		ContaPoupanca[] listaCP = leArquivoCP(arquivoCP);
		//Contando as contas
		int contCC = 0;
		int contCP = 0;
		while(listaCC[contCC]!=null)
			contCC++;
		while(listaCP[contCP]!=null)
			contCP++;

		String opc;
		do{
			System.out.println("Selecione uma opção");
			System.out.println("cc - cadastrar conta corrente");
			System.out.println("cp - cadastrar conta poupança");
			System.out.println("ac - acessar conta corrente");
			System.out.println("ap - acessar conta poupança");
			System.out.println("lc - listar todas as contas corrente");
			System.out.println("lp - listar todas as contas poupança");
			System.out.println("e - sair");
			opc = leString("");
			switch (opc){
				case "cc"->{
					listaCC[contCC] = cadastraCC();
					contCC++;
				}
				case "cp"->{
					listaCP[contCP] = cadastraCP();
					contCP++;
				}
				case "ac"->{
					String identificador = leString("Qual o identificador");
					String senha = leString("Qual a senha");
					int posicao = -1;
					for(int i=0;i<contCC;i++){
						if(listaCC[i].validaAcesso(identificador,senha))
							posicao = i;
					}
					if(posicao>=0){
						listaCC[posicao] = acessaCC(listaCC[posicao]);
					}
					else{
						System.out.println("Conta inexistente ou senha incorreta!");
					}
				}
				case "ap"->{
					String identificador = leString("Qual o identificador");
					String senha = leString("Qual a senha");
					int posicao = -1;
					for(int i=0;i<contCP;i++){
						if(listaCP[i].validaAcesso(identificador,senha))
							posicao = i;
					}
					if(posicao>=0){
						listaCP[posicao] = acessaCP(listaCP[posicao]);
					}
					else{
						System.out.println("Conta inexistente ou senha incorreta!");
					}
				}
				case "lc"->{
					System.out.println("Todos os id de conta corrente cadastrados: ");
					for(int i=0;i<contCC;i++){
						System.out.println(listaCC[i].getIdentificador());
					}
				}
				case "lp"->{
					System.out.println("Todos dos ids de conta poupança cadastrados");
					for(int i=0;i<contCP;i++){
						System.out.println(listaCP[i].getIdentificador());
					}
				}
				case "e"->{
					gravaArquivoContaCC(arquivoCC, listaCC);
					gravaArquivoContaCP(arquivoCP,listaCP);
				}
			}
		}
		while(!opc.equals("e"));
	}
}
