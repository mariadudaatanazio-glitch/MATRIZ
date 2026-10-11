import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Soma na diagpnal de matriz 4x4");
        //variaveis

        int[][] matriz = new int[4][4];

        int somaDiagonal = 0;

        // definir valores da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }
        // 2. Calcular a soma da diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("A soma da diagonal principal é: " + somaDiagonal);

        scanner.close();
    }
}