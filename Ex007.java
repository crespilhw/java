import java.util.Scanner;
public class Ex007
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double h, peso;
		System.out.println("Insira a sua altura: ");
		h = ler.nextDouble();
		peso = (72.7* h) - 58;
		System.out.println("O peso ideal é : " + peso + "kg");
	}
}
