import java.util.Scanner;
public class Ex011
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n1;
		System.out.println("Insira o número: ");
		n1 = ler.nextInt();
		
		if (n1 > 0){
		    System.out.println("O número é positivo.");
		}
     	else if (n1 < 0){
		    System.out.println("O número é negativo.");
		}
	}
}
