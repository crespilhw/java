
import java.util.Scanner;
public class Peso
{
    public static void main(String[] args) {
     double p1, p2, alt;
     char sexo;
      Scanner ler = new Scanner(System.in);

     System.out.println("Insira M) para Homem, ou, F) para mulher");
     sexo= ler.next().toUpperCase().charAt(0);
     System.out.println("Insira sua altura");
     alt = ler.nextDouble();

     p1 = (72.7 * alt) - 58;
     p2 = (62.1 * alt) - 44.7;

     if (sexo == 'M')
     System.out.println("Seu peso ideal é de " + p1 + " Kgs");
     else if (sexo == 'F')
     System.out.println("Seu peso ideal é de " + p2 + " Kgs");
     else
     System.out.println("Genero Invalido");
    }

}
