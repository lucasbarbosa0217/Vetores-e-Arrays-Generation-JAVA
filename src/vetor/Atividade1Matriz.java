package vetor;

import java.util.Scanner;

public class Atividade1Matriz {
	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em
		 * seguida, mostre na tela: Todos os elementos da Diagonal Principal Todos os
		 * elementos da Diagonal Secundária A Soma de todos os elementos da Diagonal
		 * Principal A Soma de todos os elementos da Diagonal Secundária
		 * 
		 */

		int valores[][] = new int[3][3];
		int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
		String diagonalPrincipal = "", diagonalSecundaria = "";

		Scanner scanner = new Scanner(System.in);

		for (int linha = 0; linha < valores.length; linha++) {
			for (int coluna = 0; coluna < valores[linha].length; coluna++) {
				System.out.printf("Digite o valor do índice [%d][%d]: ", linha, coluna);
				valores[linha][coluna] = scanner.nextInt();

				if (coluna == linha) {
					diagonalPrincipal += " " + valores[linha][coluna];
					somaDiagonalPrincipal += valores[linha][coluna];
				}
				if ((linha + coluna) == valores[linha].length - 1) {
					diagonalSecundaria += " " + valores[linha][coluna];
					somaDiagonalSecundaria += valores[linha][coluna];
				}

			}
		}

		scanner.close();
		System.out.println("________________________________________");
		System.out.println("Elementos da Diagonal Principal:");
		System.out.println(diagonalPrincipal.trim());
		System.out.println("Elementos da Diagonal Secundária:");
		System.out.println(diagonalSecundaria.trim());
		System.out.println("Soma dos Elementos da Diagonal Principal:");
		System.out.println(somaDiagonalPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária:");
		System.out.println(somaDiagonalSecundaria);

	}
}
