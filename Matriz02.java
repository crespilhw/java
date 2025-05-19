import java.util.Scanner;

public class Matriz02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] matrizO = new int[3][4];
        int[][] matrizM = new int[3][4];

        System.out.println("Digite os elementos da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                int valor = ler.nextInt();
                matrizO[i][j] = valor;
                matrizM[i][j] = (valor < 0) ? 0 : valor;
            }
        }

        System.out.println("\nMatriz Original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizO[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Modificada (negativos substituídos por 0):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println();
        }

        ler.close();
    }
}