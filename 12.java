import java.util.Scanner;
import java.time.LocalDate;

public class Doze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoAtual, anoNascimento, idade, anosFaltando;



        System.out.print("Digite o ano de nascimento do: ");
        anoNascimento = ler.nextInt();

        anoAtual = LocalDate.now().getYear();
        idade = anoAtual - anoNascimento;

        if (idade < 18) {
             anosFaltando = 18 - idade;
            System.out.printf("Faltam %d anos para o alistamento militar. ", anosFaltando);
        } else if (idade == 18) {
            System.out.println("É o ano do alistamento militar.");
        } else {
            int anosPassados = idade - 18;
            System.out.printf("Já se passaram %d anos desde o alistamento militar.", anosPassados);
        }
    }
}
