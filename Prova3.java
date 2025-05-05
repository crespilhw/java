import java.util.Scanner;
 public class Prova3
 {
 	public static void main(String[] args) {
 		Scanner ler = new Scanner(System.in);
 		
 		System.out.println("Informe um número");
 		  int num = ler.nextInt();
 		  
 		  if (isPrimo(num)) {
             System.out.println(num + " é um número primo.");
         } else {
             System.out.println(num + " não é um número primo.");
         }
 
     }
 
     public static boolean isPrimo(int num) {
         if (num <= 1) {
             return false; 
         }
         for (int i = 2; i <= Math.sqrt(num); i++) {
             if (num % i == 0) {
                 return false; 
             }
         }
         return true; 
     }
 }