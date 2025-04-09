
import java.util.Scanner;
public class Ex43
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);

    double sal, aum, imp, t, salf;
    
    System.out.println("Insira o valor do salário: ");
    sal = ler.nextDouble();
    aum = sal * 0.15;
    imp = sal * 0.08;
    t = aum - imp;
    salf = sal + t;
    
    System.out.println("O salário inicial era: " + sal + " O aumento foi de :" + aum + " O salário final é: " + salf);
   
	}
}
