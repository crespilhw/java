import java.util.Scanner;

public class Ex50_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];
        double impostos;
        int total = 0;
        double totalComImpostos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o valor do " + (i + 1) + "º produto: ");
            valores[i] = scanner.nextInt();
            total += valores[i];
        }

        for (int i = 0; i < 10; i++) {
            if (valores[i] > 1200) {
                impostos = valores[i] * 0.25;
            } else {
                impostos = valores[i] * 0.08;
            }

            System.out.println("Produto " + (i + 1) + " - Valor sem impostos: " + valores[i] + " R$, Valor com impostos: " + (valores[i] + impostos) + " R$");

            totalComImpostos += valores[i] + impostos;
        }

        System.out.println("\nO total dos valores dos produtos sem impostos é: " + total + " R$");

        System.out.println("O total dos valores dos produtos com impostos é: " + totalComImpostos + " R$");
    }
}