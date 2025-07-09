package aula18;

import java.util.HashMap;

public class ExemploHashMap {
	public static void main(String[] args) {
		//Não pode usar int, float, double, char, boolean
		//Pode usar Integer, Float, Double, String, Pessoa
		HashMap<String,String> mapa = new HashMap<>();
		//Adicionando um elemento
		mapa.put("RS","Porto Alegre");
		mapa.put("PR","Curitiba");
		mapa.put("SC","Florianópolis");
		mapa.put("SP","São Paulo");
		mapa.put("RJ","Rio de Janeiro");
		System.out.println(mapa);
		mapa.put("RS","Rio Grande");
		System.out.println(mapa);
		System.out.println("\nChaves do mapa");
		//Iterar pelas chaves
		for(String chave : mapa.keySet()){
			System.out.print(chave+" ");
		}
		System.out.println("\nValores do mapa");
		//Iterando pelos values
		for(String valor: mapa.values()){
			System.out.print(valor+" ");
		}
	}
}
