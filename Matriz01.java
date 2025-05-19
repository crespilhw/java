import java.util.Scanner;
public class Matriz01
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        System.out.println("Digite os elementos da Matriz 4x4: ");
        for (int i = 0; i < 4; i++){
            for (int j=0; j < 4; j++){
                System.out.print("Elemento [" + i +"][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++){
            for (int j=0; j < 4; j++){
                System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
        }
    }
}
