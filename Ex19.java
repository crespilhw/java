import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, idadeMaisNova = Integer.MAX_VALUE;
        String nome, nomeMaisNovo = "";

       
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da " + i + "º pessoa: ");
            nome = ler.nextLine(); 
            System.out.print("Digite a idade da " + i + "º pessoa: ");
            idade = ler.nextInt(); 
            ler.nextLine(); 

         
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }

        
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo + " com " + idadeMaisNova + " anos.");

    }
}