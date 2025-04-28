import java.util.Scanner;

public class Ex7_ {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Base: ");
        int base = ler.nextInt();
        System.out.println("Expoente: ");
        int expoente = ler.nextInt();
        
        int resultado = 1;
        
         for (int i = 0; i < expoente; i++) {
            resultado *= base;   }
        System.out.println("Resultado: " + resultado);  }
    }