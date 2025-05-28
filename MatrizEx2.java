import java.util.Scanner;

public class MatrizEx2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] soma = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }

        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
                soma[j] += matriz[i][j];
            }
            System.out.println();
        }

        for (int j = 0; j < 3; j++) {
            System.out.println("Soma Coluna " + (j + 1) + " = " + soma[j]);
        }
    }
}