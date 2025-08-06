import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Digite 5 nomes:");

        for (int i = 0; i < 5; i++) {
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        System.out.println("Nomes em ordem inversa:");
        for (int i = nomes.size() - 1; i >= 0; i--) {
            System.out.println(nomes.get(i));
        }
    }
}