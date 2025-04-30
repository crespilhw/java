import java.util.Scanner;
public class Ex006
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int f, c;
		System.out.println("Insira a temperatura em farenheit: ");
		f = ler.nextInt();
		c = (5 * (f-32) / 9);
		System.out.println("Temperatura em graus celsius : " + c + "C°");
	}
}
