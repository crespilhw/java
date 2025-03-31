import java.util.Scanner;
public class Tabuada02
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.print("Insira uma tabuada: ");
        n = ler.nextInt();

        for(int i=1 ; i <= 10; i++)
        System.out.println(n + "x" + i + " = " + n*i);
    }
}