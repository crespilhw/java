import java.util.Scanner;
public class Ex013
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n1, n2, n3;
		System.out.println("Insira o 1º número: ");
		n1 = ler.nextInt();
		System.out.println("Insira o 2º número: ");
		n2 = ler.nextInt();
		System.out.println("Insira o 3º número: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 && n1 > n3){
		    System.out.println("O primeiro número é o maior.");
		}
     	else if (n2 > n1 && n2 > n3){
		    System.out.println("O segundo número é o maior.");
		}
		else if (n3 > n2 && n3 > n1){
		    System.out.println("O terceiro número é o maior.");
		}
	}
}
