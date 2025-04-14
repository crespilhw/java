import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 10;
        int tentativas = 5;
        int dificuldade;
        int numeroSecreto;
        int palpite;
        boolean acertou = false;

        System.out.println("Escolha a dificuldade:");
        System.out.println("1 - Fácil (1 a 10)");
        System.out.println("2 - Médio (1 a 50)");
        System.out.println("3 - Difícil (1 a 100)");
        System.out.print("Opção: ");
        dificuldade = scanner.nextInt();

        if (dificuldade == 2) {
            max = 50;
        } else if (dificuldade == 3) {
            max = 100;
        }

        numeroSecreto = 1 + (int)(Math.random() * max);

        System.out.println("\nTente adivinhar o número secreto de 1 a " + max + ". Você tem " + tentativas + " tentativas!");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número!");
                acertou = true;
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número é **maior**.");
            } else {
                System.out.println("O número é **menor**.");
            }
        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram. O número secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
}