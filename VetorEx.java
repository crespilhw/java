import java.util.Scanner;

public class VetorEx {
    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
        System.out.println("Digite o nome da " + (i + 1) + "ª pessoa:");
        nomes[i] = ler.nextLine();

        System.out.println("Digite a idade de " + nomes[i] + ":");
        idades[i] = ler.nextInt();
        ler.nextLine(); // limpa o \n deixado pelo nextInt
        }

        System.out.println("\nPessoas maiores de idade:");
        for (int i = 0; i < 5; i++) {
        if (idades[i] >= 18) {
         System.out.println(nomes[i] + " - " + idades[i] + " anos");
        }
        }

       
    }
}