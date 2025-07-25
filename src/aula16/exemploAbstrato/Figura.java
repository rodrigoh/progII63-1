package aula16.exemploAbstrato;

public abstract class Figura {
	private String nomeFigura;

	public String getNomeFigura() {
		return nomeFigura;
	}

	public void setNomeFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}

	public abstract double calculaArea();

	public abstract double calculaPerimetro();

}
