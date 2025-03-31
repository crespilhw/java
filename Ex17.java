import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0, numero;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = ler.nextInt(); 
            soma += numero; 
        }
        
        
        System.out.println("A soma é de: " + soma);
        
        
    }
}