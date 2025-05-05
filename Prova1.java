import java.util.Scanner;
public class Prova1
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n;
		System.out.println("Insira um número: ");
		n = ler.nextInt();
		
		if (n % 2 == 0) {
		    System.out.println("O número é par!");
		}
		
		else {
		    System.out.println("O número é ímpar!");
		}
	}
}
