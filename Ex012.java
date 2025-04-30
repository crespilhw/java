import java.util.Scanner;
public class Ex012
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int n1, n2, media;
		System.out.println("Insira o 1º nota: ");
		n1 = ler.nextInt();
		System.out.println("Insira o 2º nota: ");
		n2 = ler.nextInt();
		media = (n1 + n2) / 2;
		
		if (media == 10){
		    System.out.println("O aluno foi Aprovado com Distinção.");
		}
		else if (media >= 7){
		    System.out.println("O aluno foi aprovado.");
		}
     	else if (media < 7){
		    System.out.println("O aluno foi reprovado.");
		}
	}
}
