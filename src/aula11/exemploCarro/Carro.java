package aula11.exemploCarro;

public class Carro {
	//Atributos
	String marca;
	String modelo;
	String cor;
	int km;
	int anoFabricacao;
	float capacidadeTanque;
	float quantLitros;
	//Métodos
	boolean abastecer(float quatidade){
		if(quatidade<capacidadeTanque){
			quantLitros+=quatidade;
			return true;
		}
		return false;
	}

	void andar(){
		System.out.println(modelo+" está andando...");
	}

	void parar(){
		System.out.println(modelo+" está parado");
	}
}
