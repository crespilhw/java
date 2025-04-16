import java.util.Scanner;
public class Ex48_
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros = new int[10];
	    int s;
	    
	     for (int i = 0; i < 10; i++){ 
		System.out.println("Insira o " + (i+1) + "º número: ");
		numeros[i] = scanner.nextInt();
	    }
	   s = numeros[1] + numeros[3] + numeros[5] + numeros[7] + numeros[9];
	   	System.out.println("a soma é: " + s);
	}
}