package aula16.exemploAbstrato.exemploAbstratoDois;

public class Bicicleta extends Veiculo{

	public Bicicleta(){
		setNomeVeiculo("Bicicleta");
		setVelocidade(0);
	}

	@Override
	public float acelerar(float velocidade){
		setVelocidade(velocidade);
		System.out.println(getNomeVeiculo()+" está aumentando a cadência do pedal");
		return getVelocidade();
	}

	@Override
	public void parar(){
		setVelocidade(0);
		System.out.println(getNomeVeiculo()+" está parado");
	}
}