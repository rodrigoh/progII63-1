package aula13.exercicios.exercicio01;

public class Operacoes {
	float n1;
	float n2;

	float soma(){
		return n1+n2;
	}

	float subtrai(){
		return n1-n2;
	}

	float multiplica(){
		return n1*n2;
	}

	float divive(){
		return n1/n2;
	}

	float potencia(){
		float resp=1;
		for(int i=0;i<n2;i++){
			resp*=n1;
		}
		return resp;
	}
}
