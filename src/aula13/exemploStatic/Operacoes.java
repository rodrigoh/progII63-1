package aula13.exemploStatic;

public class Operacoes {

	static float soma(float n1, float n2){
		return n1+n2;
	}

	static float subtrai(float n1, float n2){
		return n1-n2;
	}

	static float multiplica(float n1, float n2){
		return n1*n2;
	}

	static float divive(float n1, float n2){
		return n1/n2;
	}

	static float potencia(float n1, float n2){
		float resp=1;
		for(int i=0;i<n2;i++){
			resp*=n1;
		}
		return resp;
	}
}
