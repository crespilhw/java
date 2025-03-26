import java.util.Scanner; 
public class Numero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.print("Informe o primeiro número: ");
        n1 = ler.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = ler.nextInt();
        System.out.print("Informe o terceiro número: ");
        n3 = ler.nextInt();
        
       
        if (n1 > n2 && n1 >n3)
        System.out.println("O primeiro número é o maior");
        else if (n2 > n1 && n2 > n3)
        System.out.println("O segundo número é o maior");
        else 
        System.out.println("O terceiro número é o maior");
        
        
    }   
}