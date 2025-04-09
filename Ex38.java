import java.util.Scanner;
public class Ex38
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
    double pao, broa, total, poupança;
    
    
    System.out.println("Insira a quantidade de pães vendidos: ");
    pao = ler.nextDouble();
    System.out.println("Insira a quantidade de broas vendidas: ");
    broa = ler.nextDouble();
    total = pao * 0.12 + broa * 1.50;
    poupança = total * 0.10;
    System.out.println("O total foi: " + total + "R$");
     System.out.println(poupança + " R$ serão destinados a poupança");
    
	}
}
