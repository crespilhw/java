import java.util.Scanner;
public class Ex014
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    double salario, aumento, salarioFinal;
		System.out.println("Insira o salário do funcionário: ");
		salario = ler.nextDouble();
		
		if (salario < 280){
		    aumento = salario * 0.20;
		    salarioFinal = salario + aumento;
		    System.out.println("Salário antes do aumento: " + salario + "R$");
		    System.out.println("O aumento foi de 20%");
		    System.out.println("Houve um aumento de: " + aumento + "R$");
		    System.out.println("O novo Salário será de: " + salarioFinal + "R$");
		}
     	else if (salario > 280 && salario < 700){
     	    aumento = salario * 0.15;
		    salarioFinal = salario + aumento;
		    System.out.println("Salário antes do aumento: " + salario + "R$");
		    System.out.println("O aumento foi de 15%");
		    System.out.println("Houve um aumento de: " + aumento + "R$");
		    System.out.println("O novo Salário será de: " + salarioFinal + "R$");
		}
		else if (salario > 700 && salario < 1500){
     	    aumento = salario * 0.10;
		    salarioFinal = salario + aumento;
		    System.out.println("Salário antes do aumento: " + salario + "R$");
		    System.out.println("O aumento foi de 10%");
		    System.out.println("Houve um aumento de: " + aumento + "R$");
		    System.out.println("O novo Salário será de: " + salarioFinal + "R$");
		}
		else if (salario >= 1500){
     	    aumento = salario * 0.05;
		    salarioFinal = salario + aumento;
		    System.out.println("Salário antes do aumento: " + salario + "R$");
		    System.out.println("O aumento foi de 5%");
		    System.out.println("Houve um aumento de: " + aumento + "R$");
		    System.out.println("O novo Salário será de: " + salarioFinal + "R$");
		}
		
	}
}
