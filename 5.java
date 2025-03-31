import java.util.Scanner;
public class Emprestimo
{
	public static void main(String[] args) {
	    double valor, parcelas, salario, limite, max;
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println("Insira o valor do empréstimo: ");
		valor = ler.nextDouble();
		System.out.println("Insira seu parcelas : ");
		parcelas = ler.nextDouble();
		System.out.println("Insira seu salário : ");
		salario = ler.nextDouble();
		
		limite = valor/parcelas;
		max = salario * 0.30;
	
		
		
		if (limite <= max)
		System.out.println("Aprovado");
		else
		System.out.println("Rejeitado");
		
	}
}
