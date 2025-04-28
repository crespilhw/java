import java.util.Scanner;

public class Ex8_ {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0;
        int quantidade = 5;
        
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Informe a idade: ");
            int idade = ler.nextInt();
            soma += idade;
        }
        
        double media = soma / quantidade;
         
        System.out.println("Soma das idades: " + soma);
        System.out.println("Média das idades: " + media);
    }
}