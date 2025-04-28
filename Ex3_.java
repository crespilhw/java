import java.util.Scanner;
public class Ex3_ {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int conta, n;
        System.out.println("Insira uma tabuada: ");
        n = ler.nextInt();
        for (int tabuada = 1; tabuada <= 10; tabuada++) {
        conta = n * tabuada; {
        System.out.println(n + "X" + tabuada + " = " +conta);
        }
        }
        
    }
}