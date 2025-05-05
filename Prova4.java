import java.util.Scanner;
 public class Prova4
 {
 	public static void main(String[] args) {
 		Scanner ler = new Scanner(System.in);
 		
 		String nome;
 		int idade;
 		for (int i = 1; i <= 5; i++) {
 	
 		  System.out.println("Informe seu nome: ");
 		  nome = ler.nextLine();
 		  System.out.println("Informe sua idade: ");
 		  idade = ler.nextInt();
 		  
 		  if ( idade >= 18) {
 		  System.out.println(nome + " é maior de idade");
 		}
 		  else {
 		  System.out.println(nome + " é menor de idade");
 		  }
 		  
 		}
 		  
 
     }
 }