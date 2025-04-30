import java.util.Scanner;
public class Ex004
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double m, cm;
		System.out.println("Informe os metros: ");
		m = ler.nextInt();
		cm = m * 100;
		System.out.println("A conversão de metros para centimetros é: " + cm + "cm");
	}
}
