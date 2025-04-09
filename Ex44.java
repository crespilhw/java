import java.util.Scanner;
public class Ex44
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	 double valorTotal, valorDividido, valorAndreECarlos, valorFelipe;
	 
	System.out.print("Informe o total da conta do bar: ");
	    valorTotal = ler.nextDouble();
	    
	   valorDividido = Math.floor(valorTotal / 3);
	   valorAndreECarlos = valorDividido * 2;
	   
	   valorFelipe = valorTotal - valorAndreECarlos;
	   
	    System.out.println("Carlos deve pagar R$" +  valorDividido);
        System.out.println("André deve pagar R$" +  valorDividido);
        System.out.println("Felipe deve pagar R$" + valorFelipe);
	    
	  
	}
}