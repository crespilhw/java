import java.util.Scanner;

public class Ex9_ {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int maiorQue10 = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe o número: ");
            int numero = ler.nextInt(); 
            if (numero > 10) {
                maiorQue10++;
            }
        }
            System.out.println("Total de números maiores que 10: " + maiorQue10);
        }
    }