
import java.util.Scanner;
public class Ex40
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

    double valor, gasolina, litros;
    
    System.out.println("Insira o valor da gasolina: ");
    gasolina = ler.nextInt();
    System.out.println("Insira o valor do pagamento ");
    valor = ler.nextInt();
    litros = valor / gasolina;
    System.out.println("Total de litros: " + litros + " L");
   
	}
}
