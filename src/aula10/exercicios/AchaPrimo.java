package aula10.exercicios;

public class AchaPrimo {
	public static boolean ePrimo(int numero){
		int contDiv = 0;
		for (int i = 1; i <= numero; i++)
			if(numero%i==0)
				contDiv++;
		return contDiv==2;
	}

	public static void main(String[] args) {
		System.out.println("São primos os seguintes números:");
		for (int i = 1; i < 100000; i++) {
			if(i%100==0)
				System.out.println();
			if(ePrimo(i))
				System.out.print(i+" ");
		}
	}
}
