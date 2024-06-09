package vetor;

import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
    public static char quemGanhou = ' ';
    public static boolean empate = false;

    public static void main(String[] args) {

        boolean continua = true;
        char game[][] = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
        Scanner scanner = new Scanner(System.in);
        int place[] = new int[2];

        Random random = new Random();

        do {
            imprimirJogo(game);


            boolean canPlace = false;
            do {
                System.out.println("Digite onde você deseja colocar um X [Linha][Coluna]");
                place[0] = scanner.nextInt();
                place[1] = scanner.nextInt();

                if (game[place[0]][place[1]] == ' ') {
                    game[place[0]][place[1]] = 'X';
                    canPlace = true;
                } else {
                    System.out.println("Posição já ocupada, tente novamente.");
                    canPlace = false;
                }
            } while (!canPlace);

            if (!verificarVencedor(game) || !verificarEmpate(game)) {
                break;
            }

            canPlace = false;
            do {
                int aleatorio1 = random.nextInt(3);
                int aleatorio2 = random.nextInt(3);

                if (game[aleatorio1][aleatorio2] == ' ') {
                    game[aleatorio1][aleatorio2] = 'O';
                    canPlace = true;
                }
            } while (!canPlace);

            if (!verificarVencedor(game) || !verificarEmpate(game)) {
                break;
            }
         

        } while (continua);

        imprimirJogo(game);

        if (empate) {
            System.out.println("EMPATE!");
        } else {
            System.out.printf("\nO jogador %s ganhou!\n", quemGanhou);
        }
    }

    public static void imprimirJogo(char[][] game) {
    	
    	System.out.println("________________________");

    	System.out.println("JOGO DA VELHA");
    	System.out.println("COLUNAS-   0  1  2");
        for (int linha = 0; linha < game.length; linha++) {
        	System.out.printf("Linha %d - ", linha);
            for (int coluna = 0; coluna < game[linha].length; coluna++) {
                System.out.printf("[%s]", game[linha][coluna]);
            }
            System.out.println();
        }
    	System.out.println("________________________\n");

    }

    public static boolean verificarVencedor(char[][] game) {

        for (int i = 0; i < 3; i++) {
            if ((game[i][0] == game[i][1] && game[i][1] == game[i][2]) && game[i][0] != ' ') {
                quemGanhou = game[i][0];
                return false;
            }
            if ((game[0][i] == game[1][i] && game[1][i] == game[2][i]) && game[0][i] != ' ') {
                quemGanhou = game[0][i];
                return false;
            }
        }

        if ((game[0][0] == game[1][1] && game[1][1] == game[2][2]) && game[0][0] != ' ') {
            quemGanhou = game[0][0];
            return false;
        }
        if ((game[0][2] == game[1][1] && game[1][1] == game[2][0]) && game[0][2] != ' ') {
            quemGanhou = game[0][2];
            return false;
        }

        return true;
    }

    public static boolean verificarEmpate(char[][] game) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (game[i][j] == ' ') {
                    return true;
                }
            }
        }
        empate = true;
        return false;
    }
}
