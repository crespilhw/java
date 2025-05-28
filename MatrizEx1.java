import java.util.Scanner;

public class MatrizEx1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int par = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    par++;
                }
            }
        }

        System.out.println("\nMatriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nA matriz tem " + par + " números pares");
    }
}