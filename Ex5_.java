import java.util.Scanner;

public class Ex5_ {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;
        
        while (numero <= 100) {
            if (numero % 2 == 0) {
                soma += numero;
                System.out.println(numero);
            }
            numero++;
            }
            System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
        }
    }