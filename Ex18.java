import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0, idade, m = 0;
        double media = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a " + i + "º idade: ");
            idade = ler.nextInt(); 
            soma += idade; 
            media = soma / 20.0;
        
        if (idade >= 18)
        m++;}
        
        System.out.println("A soma das idades é de: " + soma);
        System.out.println("A média das idades é de: " + media);
        System.out.println(m + " Pessoas são maiores de idade");
        
        
    }
}