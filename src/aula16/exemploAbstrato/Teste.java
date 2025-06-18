package aula16.exemploAbstrato;

public class Teste {
	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		System.out.println("Calculando a área e o perímetro do "+c1.getNomeFigura());
		c1.setRaio(5);
		System.out.printf("Área %.2f\n",c1.calculaArea());
		System.out.printf("Perímetro %.2f\n",c1.calculaPerimetro());

		Retangulo r1 = new Retangulo();
		r1.setBase(5);
		r1.setAltura(3);

		System.out.println("Calculando a área e o perímetro da figura "+r1.getNomeFigura());
		System.out.printf("Área %.2f\n",r1.calculaArea());
		System.out.printf("Perímetro %.2f\n",r1.calculaPerimetro());
	}
}
