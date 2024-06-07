package vetor;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2Array {
	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em
		 * seguida, mostre na tela: Todos os elementos dos índices ímpares do vetor
		 * Todos os elementos do vetor que são números pares A Soma de todos os
		 * elementos do vetor A Média de todos os elementos do vetor, armazenada em uma
		 * variável do tipo real
		 * 
		 */
		Locale.setDefault(Locale.US);
		
		int valores[] = new int[10];
		int indice = 0, soma = 0;
		String pares = "", elementosIndiceImpares = "";
		float media;
		
		Scanner scanner = new Scanner(System.in);
		
		while(indice < valores.length) {
			System.out.printf("Digite o valor do índice %d: ", indice);
			valores[indice] = scanner.nextInt();
			
			if(indice%2 != 0) {
				elementosIndiceImpares = elementosIndiceImpares +" "+ valores[indice];
			}
			
			if(valores[indice]%2 == 0) {
				pares = pares + " " + valores[indice];
			}
			
			soma += valores[indice];
			
			indice++;
		}
		
		scanner.close();
		
		media = (float) soma/valores.length;
		
		System.out.println("_________________________________");
		
		System.out.printf("Elementos nos índices ímpares: \n");
		System.out.println(elementosIndiceImpares.trim());
		
		System.out.printf("Elementos pares: \n");
		System.out.println(pares.trim());
		
		System.out.printf("Soma: \n");
		System.out.println(soma);
		
		System.out.printf("Media: \n");
		System.out.printf("%.2f", media);
		
	}
}
