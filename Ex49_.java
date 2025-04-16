
import java.util.Scanner;
public class Ex49_
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] numeros1 = new int[10];
	    int[] numeros2 = new int[10];
	    int[] soma = new int[10];
	    
	    for (int i = 0; i < 10; i++){ 
	    System.out.println("Escreva o " +(i+1)+ "º número do primeiro vetor: ");
	    numeros1[i] = scanner.nextInt();
	    }
	    for (int i = 0; i < 10; i++){
	    System.out.println("Escreva o " +(i+1)+ "º número do segundo vetor: ");
	    numeros2[i] = scanner.nextInt();
	    }
	    
	    for (int i = 0; i < 10; i++) {
        soma[i] = numeros1[i] + numeros2[i];
   }
	    
	     System.out.println("\nA soma dos vetores é:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Soma["+i+"] = " + soma[i]);
        }

	    
	    
	}
}
