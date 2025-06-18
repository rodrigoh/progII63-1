package aula16.exemploInterface;

public class Circulo implements Figura{

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI*Math.pow(raio,2);
	}

	@Override
	public double caculaPerimetro() {
		return 2*Math.PI*raio;
	}
}
