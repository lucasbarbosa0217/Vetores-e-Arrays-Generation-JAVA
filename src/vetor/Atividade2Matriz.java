package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2Matriz {
	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que leia as notas de uma classe com 10 participantes
		 * durante 4 bimestres de um ano. As 4 notas de cada participante serão
		 * armazenadas em uma linha de uma matriz de números reais, logo cada linha da
		 * matriz serão as notas de um participante. Em um vetor de números reais,
		 * armazene as médias de cada participante e exiba as médias de cada um na tela
		 * 
		 */
		Locale.setDefault(Locale.US);

		float notas[][] = new float[10][4];
		float medias[] = new float[10];
		float soma = 0;

		Scanner scanner = new Scanner(System.in);

		for (int linha = 0; linha < notas.length; linha++) {
			soma = 0;
			System.out.printf("Digite as quatro notas do Aluno %d:%n", linha + 1);
			for (int coluna = 0; coluna < notas[linha].length; coluna++) {
				notas[linha][coluna] = scanner.nextFloat();
				soma += notas[linha][coluna];
			}
			medias[linha] = (float) soma / 4;
		}

		for (int i = 0; i < medias.length; i++) {
			System.out.printf("[%.1f]", medias[i]);
		}

		scanner.close();
	}

}
