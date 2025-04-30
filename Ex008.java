import java.util.Scanner;
public class Ex008
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double peso, excesso, multa;
		System.out.println("Insira o peso dos peixes: ");
		peso = ler.nextDouble();
		System.out.println("Insira o peso excessivo (acima de 50): ");
		excesso = ler.nextDouble();
		multa = excesso * 4;
     	System.out.println("Você deverá pagar " + multa );
	}
}
