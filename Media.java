import java.util.Scanner; 
public class Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n1, n2, n3, soma, media;
        
        System.out.print("Informe primeira nota: ");
        n1 = ler.nextInt();
        System.out.print("Informe segunda nota: ");
        n2 = ler.nextInt();
        System.out.print("Informe terceira nota: ");
        n3 = ler.nextInt();
        
        soma = n1 + n2 + n3;
        media = soma / 3;
        
        if (media >= 7)
        System.out.println("O aluno passou!");
        else
        System.out.println("O aluno reprovou!");
        
        
        
    }   
}
