package aula11.exemploCarro;

public class Exemplo01 {
	public static void main(String[] args) {
		//Criando uma instância de carro
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		c1.modelo = "fusca";
		c1.marca = "vw";
		c1.capacidadeTanque = 45;
		c1.anoFabricacao = 1980;
		c1.km = 85000;
		System.out.println("Abastecendo "+c1.modelo+" com 10 litros "+c1.abastecer(10));
		c1.andar();
		c1.parar();
		//Atribuindo valores para c2
		c2.marca = "fiat";
		c2.modelo = "500";
		c2.cor = "vermelho";
		c2.anoFabricacao = 1965;
		c2.km = 99999;
		c2.capacidadeTanque = 30;
		c2.abastecer(20);
		c2.andar();
		c2.parar();
	}
}
