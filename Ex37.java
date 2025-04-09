import java.util.Scanner;
public class Ex37
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
    int cavalos, ferradura;
    
    
    System.out.println("Insira a quantidade de cavalos: ");
    cavalos = ler.nextInt();
     ferradura = cavalos*4;
    System.out.println("Será necessário: " + ferradura + " ferraduras");
    
	}
}
