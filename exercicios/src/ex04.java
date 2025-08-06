import java.util.ArrayList;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {

        System.out.println("Insira suas notas do semestre (5 notas): ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            double nota = sc.nextDouble();
            notas.add(nota);
            soma += nota;
        }
        double media = soma / notas.size();
        long acima = notas.stream().filter(n -> n > media).count();
        System.out.println("Média: " + media + ", Acima da média: " + acima);
    }
}