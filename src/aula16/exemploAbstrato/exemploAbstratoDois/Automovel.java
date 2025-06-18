package aula16.exemploAbstrato.exemploAbstratoDois;

public class Automovel extends Veiculo{
	private float quantOleo;
	private int kmOleo;

	public Automovel(){
		setNomeVeiculo("Automóvel");
		setVelocidade(0);
	}

	@Override
	public float acelerar(float velocidade) {
		kmOleo-=2;
		setVelocidade(velocidade);
		System.out.println(getNomeVeiculo()+" está acelerando...");
		return getVelocidade();
	}

	@Override
	public void parar() {
		setVelocidade(0);
		System.out.println(getNomeVeiculo()+" está parado");
	}

	public void trocarOleo(float litros){
		kmOleo = 6000;
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e){
			System.out.println("Algo deu errado na troca de óleo");
		}
		System.out.println("Óleo trocado...");
	}

}
