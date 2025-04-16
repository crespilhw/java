import java.util.Scanner;

public class Ex54_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores a serem lidos: ");
        int N = scanner.nextInt();

        int[] valores = new int[N];
        int contagemPares = 0;
        int produtoImpares = 1;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor inteiro: ");
            valores[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (valores[i] % 2 == 0) {
                contagemPares++; 
            } else {
                produtoImpares *= valores[i]; 
            }
        }

        System.out.println("Quantidade de valores pares: " + contagemPares);

        if (produtoImpares != 1) {
            System.out.println("Produto dos valores ímpares: " + produtoImpares);
        } else {
            System.out.println("Não há valores ímpares para multiplicar.");
        }
    }
}