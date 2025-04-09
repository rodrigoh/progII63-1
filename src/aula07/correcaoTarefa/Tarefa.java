package aula07.correcaoTarefa;

import java.util.Random;

public class Tarefa {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] quantidades = {10, 100, 10000,100000,200000};
		String linha = "------------------+------------+--------------+------------------\n";
		String resultados = "    Algoritmo     |  Tamanho   |  Tempo (ms)  |  Tempo reord(ms) \n";
		resultados += linha;
		String formato = "%17s |%11d |%11dms |%11dms\n";
		for (int tamanho : quantidades) {
			int[] vi = new int[tamanho];
			int[] vs = new int[tamanho];
			System.out.print("\nGerando " + tamanho + " números...");
			//Gerando um vetor aleatório
			for (int i = 0; i < tamanho; i++) {
				vi[i] = aleatorio.nextInt(1, 1000);
				vs[i] = vi[i];
			}
			System.out.println("[OK]");
			//Mostrando o v gerado (usar com vetores pequenos, a etapa de impressão de dados é demorada)

			if (tamanho < 100) {
				System.out.println("\nMostrando o vetor");
				for (int i : vi)
					System.out.print(i + " ");
			}
			System.out.print("\nOrdenando o vetor com o InsertionSort...");
			//Código do InsertionSort
			long tempoInicial = System.currentTimeMillis();
			for (int i = 1; i < vi.length; i++) {
				int chave = vi[i];
				int j = i - 1;
				while (j >= 0 && vi[j] > chave) {
					vi[j + 1] = vi[j];
					j = j - 1;
				}
				vi[j + 1] = chave;
			}
			long tempoFinal = System.currentTimeMillis();
			System.out.println("[OK]");

			long tempoInsertionSort = tempoFinal - tempoInicial;
			//Mostrando o vetor
			if (tamanho < 100) {
				System.out.println("\nOrdenado com Insertion");
				for (int i : vi)
					System.out.print(i + " ");
			}
			System.out.print("\nReordenando o vetor com o InsertionSort...");
			//Código do InsertionSort
			tempoInicial = System.currentTimeMillis();
			for (int i = 1; i < vi.length; i++) {
				int chave = vi[i];
				int j = i - 1;
				while (j >= 0 && vi[j] > chave) {
					vi[j + 1] = vi[j];
					j = j - 1;
				}
				vi[j + 1] = chave;
			}
			tempoFinal = System.currentTimeMillis();
			System.out.println("[OK]");
			long tempoReordInsertionSort = tempoFinal - tempoInicial;

			System.out.print("\nOrdenando o vetor com o SelectionSort...");
			//Código do insertionSort
			tempoInicial = System.currentTimeMillis();
			for (int i = 0; i < vs.length-1; i++) {
				int min = i;
				for(int j = i+1; j<vs.length;j++){
					if (vs[j] < vs[min]){
						min = j;
					}
				}
				if(min != i){
					int aux = vs[i];
					vs[i] = vs[min];
					vs[min] = aux;
				}
			}
			tempoFinal = System.currentTimeMillis();
			long tempoSelectionSort = tempoFinal - tempoInicial;
			System.out.println("[OK]");
			//Mostrando o vetor
			if (tamanho < 100) {
				System.out.println("\nOrdenado com Selection");
				for (int i : vs)
					System.out.print(i + " ");
			}

			System.out.print("\nReordenando o vetor com o SelectionSort...");
			//Código do insertionSort
			tempoInicial = System.currentTimeMillis();
			for (int i = 0; i < vs.length-1; i++) {
				int min = i;
				for(int j = i+1; j<vs.length;j++){
					if (vs[j] < vs[min]){
						min = j;
					}
				}
				if(min != i){
					int aux = vs[i];
					vs[i] = vs[min];
					vs[min] = aux;
				}
			}
			tempoFinal = System.currentTimeMillis();
			long tempoReordSelectionSort = tempoFinal - tempoInicial;
			System.out.println("[OK]");

			//Mostrando os resultados...
			resultados+=String.format(formato,"Insertion Sort",tamanho,tempoInsertionSort,tempoReordInsertionSort);
			resultados += linha;
			resultados+=String.format(formato,"Selection Sort",tamanho,tempoSelectionSort,tempoReordSelectionSort);
			resultados += linha;
			System.out.println("\nPara ordenar " + tamanho + " elementos o Insertion Sort precisou de " + tempoInsertionSort + "ms");
			System.out.println("\nPara reordenar " + tamanho + " elementos o Insertion Sort precisou de " + tempoReordInsertionSort + "ms");
			System.out.println("\nPara ordenar " + tamanho + " elementos o Selection Sort precisou de " + tempoSelectionSort + "ms");
			System.out.println("\nPara reordenar " + tamanho + " elementos o Selection Sort precisou de " + tempoReordSelectionSort + "ms");
		}
		System.out.println(resultados);
	}
}