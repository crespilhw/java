import java.util.Scanner;
public class Ex005
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double h, g, s;
		System.out.println("Quanto você ganha por hora?: ");
		g = ler.nextInt();
		System.out.println("Quantas hora você trabalha no mês?: ");
		h = ler.nextInt();
		s = h * g;
		System.out.println("O salário no fim do mês será : " + s + "R$");
	}
}
