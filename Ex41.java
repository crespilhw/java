
import java.util.Scanner;
public class Ex41
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

    double kgs, valor;
    
    System.out.println("Insira o peso da refeição: ");
    kgs = ler.nextDouble();
    valor = kgs * 12;
    System.out.println("Valor a pagar: " + valor + " R$");
   
	}
}
