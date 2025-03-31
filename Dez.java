import java.util.Scanner;
public class Combustivel

{
    public static void main(String[] args) {
     double vg, g, eta, ct;
     char tc;
     Scanner ler = new Scanner(System.in);

     System.out.println("Digite G) para gasolina, ou, E) para alcool");
         tc = ler.next().toUpperCase().charAt(0);
     System.out.println("Digite qual a capacidade do tanque em litros: ");
         ct = ler.nextDouble();
     g = ct * 1.80;
     eta = ct * 1;
     if (tc == 'G')
     System.out.println("Você irá pagar " + g + " reais");
     else if (tc == 'E')
     System.out.println("Você irá pagar " + eta + " reais");
     else
     System.out.println("Insira uma letra valida");
    }
}