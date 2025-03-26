import java.util.Scanner;
public class Bonus
{
	public static void main(String[] args) {
	    double anos, salario, bonus20, bonus10;
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println("Você está a quantos anos na empresa? : ");
		anos = ler.nextDouble();
		System.out.println("Insira seu salário : ");
		salario = ler.nextDouble();
		
			bonus20 = salario * 0.20;
				bonus10 = salario * 0.10;

		
		if (anos >= 5)
		System.out.println("O seu bônus será: " + bonus20);
		else
		System.out.println("O seu bônus será: " + bonus10);
		
	}
}
