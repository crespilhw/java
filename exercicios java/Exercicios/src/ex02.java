import java.util.Scanner;

public class ex02 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Informe o primeiro valor: ");
        n1 = ler.nextInt();

        System.out.println("Informe o segundo valor: ");
        n2 = ler.nextInt();

        System.out.println("Informe o segundo valor: ");
        n3 = ler.nextInt();

        if (n1>=n2 && n1>=n3) {
            System.out.println("O primeiro é o maior: " + n1);
        }
        else if (n2>=n1 && n2>=n3) {
            System.out.println("O segundo é o maior: " + n2);
        }
        else  {
            System.out.println("O terceiro é o maior: " + n3);
        }
    }
}