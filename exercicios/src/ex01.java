import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite números inteiros (digite '0' para parar):");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            numeros.add(numero);
        }

        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("\nElementos multiplicados por 2:");
        for (int num : numeros) {
            System.out.println(num + " x 2 = " + (num * 2));
        }


    }
}
