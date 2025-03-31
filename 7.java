import java.util.Scanner;
public class Vendas
{
	public static void main(String[] args) {
	    double com, vendas, total;
	    Scanner ler = new Scanner(System.in);
	    
	    System.out.println("Insira valor que você vendeu: ");
	    vendas = ler.nextDouble();
	    
	    com = vendas * 0.10;
	    total = 1200 + com;
	     
	      
	   if (vendas >= 2000)
	   System.out.println("A sua comissão é de: R$ " + com + "Seu salário será de: R$ " + total);
	   else
	   System.out.println("Você não tem comissão, Seu salário será de: R$ 1200 ");
	   
	}
}
