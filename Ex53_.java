import java.util.Arrays;
import java.util.Scanner;

public class Ex53_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[10];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor real: ");
            valores[i] = scanner.nextDouble();
        }

        double[] valoresCrescentes = Arrays.copyOf(valores, valores.length);
        double[] valoresDecrescentes = Arrays.copyOf(valores, valores.length);

        Arrays.sort(valoresCrescentes);

        Arrays.sort(valoresDecrescentes);
        for (int i = 0; i < valoresDecrescentes.length / 2; i++) {
            double temp = valoresDecrescentes[i];
            valoresDecrescentes[i] = valoresDecrescentes[valoresDecrescentes.length - 1 - i];
            valoresDecrescentes[valoresDecrescentes.length - 1 - i] = temp;
        }

        System.out.println("Valores em ordem crescente:");
        for (double valor : valoresCrescentes) {
            System.out.printf("%.2f ", valor);
        }
        System.out.println();

        System.out.println("Valores em ordem decrescente:");
        for (double valor : valoresDecrescentes) {
            System.out.printf("%.2f ", valor);
        }
        System.out.println();

        System.out.println("Valores na ordem inversa da entrada:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.printf("%.2f ", valores[i]);
        }
        System.out.println();

    }
}