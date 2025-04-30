import java.util.Scanner;
public class Ex003
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n1, n2, n3, n4, media;
		System.out.println("Informe a primeira nota: ");
		n1 = ler.nextInt();
		System.out.println("Informe a segunda nota: ");
		n2 = ler.nextInt();
		System.out.println("Informe a terceira nota: ");
		n3 = ler.nextInt();
		System.out.println("Informe a quarta nota: ");
		n4 = ler.nextInt();
		media = (n1 + n2 + n3 + n4) / 4;
		System.out.println("A média do bimestre é: " + media);
	}
}
