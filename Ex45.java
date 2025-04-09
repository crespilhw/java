import java.util.Scanner;
public class Ex45
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	 int qntdLanches;
	 double qntdQueijo = 0.1, qntdPresunto = 0.05, qntdHamburguer = 0.1, kgsQueijo, kgsPresunto, kgsHamburguer;
	 
	System.out.println("Quantos sanduíches você deseja?");
	     qntdLanches = ler.nextInt();
	     
	 kgsQueijo = qntdQueijo * qntdLanches;
	 kgsPresunto = qntdPresunto * qntdLanches;
	 kgsHamburguer = qntdHamburguer * qntdLanches;
	 
	 System.out.println("Para fazer os " + qntdLanches + " lanches será necessário " + kgsQueijo + " kgs de queijo");
	 System.out.println("Para fazer os " + qntdLanches + " lanches será necessário " + kgsPresunto + " kgs de presunto");
	 System.out.println("Para fazer os " + qntdLanches + " lanches será necessário " + kgsHamburguer + " kgs de hambúrguer");
	}
}