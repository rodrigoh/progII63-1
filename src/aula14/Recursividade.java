package aula14;

public class Recursividade {

	//n! = (n-1)!*n para n>1, para n = 1 fatorial é 1
	public static int fatorial(int n){
		if (n==1)
			return 1;
		else
			return fatorial(n-1)*n;
	}

	//F(0) = 0, F(1) = 1 para n>1 F(n) = F(n-1)+F(n-2)
	public static int fibonacci(int n){
		if (n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}

	//x^n = x*x^n-1 para n>0 e n==0 x
	public static int potencia(int base, int exp){
		if(exp==0)
			return 1;
		else
			return potencia(base,exp-1)*base;
	}

	public static void main(String[] args) {
		System.out.println(fatorial(5));
		for (int i = 0; i <= 10; i++) {
			System.out.print(fibonacci(i)+" ");
		}
	}
}
