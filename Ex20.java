import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count0a100 = 0, count101a200 = 0, countMaiorQue200 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                count0a100++;
            } else if (numero >= 101 && numero <= 200) {
                count101a200++;
            } else if (numero > 200) {
                countMaiorQue200++; 
            }
        }

        // Exibe os resultados
        System.out.println("Quantidade de números entre 0 e 100: " + count0a100);
        System.out.println("Quantidade de números entre 101 e 200: " + count101a200);
        System.out.println("Quantidade de números maiores que 200: " + countMaiorQue200);

    }
}