package vetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Atividade1Array {

	public static void main(String[] args) {
		/*
		 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
		 * construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
		 * irá digitar um número e o programa deve exibir na tela a posição deste número
		 * no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
		 * encontrado!” deve ser exibida na tela. Veja os exemplos abaixo
		 */

		Locale.setDefault(Locale.US);

		int valores[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 3 };
		int valorParaEncontrar, indice = -1;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número que você deseja encontrar:");
		valorParaEncontrar = scanner.nextInt();

		indice = Arrays.binarySearch(valores, valorParaEncontrar);

		if (indice >= 0) {
			System.out.printf("O número %d está localizado na posição: %d", valorParaEncontrar, indice);
		} else {
			System.out.printf("O número %d não foi encontrado!", valorParaEncontrar);
		}

		// AGORA VERSÂO ALTERNATIVA COM LAÇO FOR

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == valorParaEncontrar) {
				indice = i;
				break;
			}
		}

		System.out.println("\n___________________________________________________________");
		System.out.println("OUTPUT VERSÃO USANDO FOR:");

		if (indice < valores.length && indice >= 0) {
			System.out.printf("O número %d está localizado na posição: %d", valorParaEncontrar, indice);
		} else {
			System.out.printf("O número %d não foi encontrado!", valorParaEncontrar);
		}

		scanner.close();

	}
}
