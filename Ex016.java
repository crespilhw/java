import java.util.Scanner;
public class Ex016
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n;
		System.out.println("Insira um número: ");
		n = ler.nextInt();
		
		if (n % 2 == 0){
		    System.out.println("O número " + n + " é par!");
		}
		else {
		    System.out.println("O número " + n + " é impar!");
		}
	}
}