import java.util.Scanner;

public class Ex6_ {
    public static void main(String[] args) {
        int soma = 0;
        
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
                System.out.println(i);
            }
            }
            System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
        }
    }