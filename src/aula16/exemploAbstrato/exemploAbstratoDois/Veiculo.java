package aula16.exemploAbstrato.exemploAbstratoDois;

public abstract class Veiculo {
	private String nomeVeiculo;
	private float velocidade;

	public String getNomeVeiculo() {
		return nomeVeiculo;
	}

	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public abstract float acelerar(float velocidade);

	public abstract void parar();
}
