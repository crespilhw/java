import java.util.Scanner;
public class Ex30
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, w, t = 1;
        
    
        System.out.println("Insira uma tabuada");
        n = ler.nextInt();
            
        while (t <= 10) {
            w = n * t;
            t++;
            System.out.println(w); }
        
        
    }
}