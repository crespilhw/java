import java.util.Scanner;
public class Ex4_
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, tabuada = 1;

        System.out.println("Escolha o número: ");
        numero = ler.nextInt();

        while (tabuada <= 10){
        System.out.println(numero + " . " + tabuada + " = " + (numero tabuada));
        tabuada++;
        }
    }
}