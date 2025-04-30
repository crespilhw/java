import java.util.Scanner;
public class Ex002
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n1, n2, soma;
		System.out.println("Informe um número: ");
		n1 = ler.nextInt();
		System.out.println("Informe um número: ");
		n2 = ler.nextInt();
		soma = n1 + n2;
		System.out.println("A soma dos números é: " + soma);
	}
}
