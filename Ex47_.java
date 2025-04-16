import java.util.Scanner;
public class Ex47_
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[20];
	    
	    for (int i = 0; i < 20; i++){ 
		System.out.println("Insira o " + (i+1) + "º número: ");
		numeros[i] = scanner.nextInt();
	    }
	    
	      System.out.println("Números na ordem inversa: ");
	    for (int i = 19; i >= 0; i--) {
	    System.out.println(numeros[i]);
	    }
	}
}
