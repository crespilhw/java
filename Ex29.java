import java.util.Scanner;
public class Ex29
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int aluno, contador = 1;
        double peso, somap = 0, media;
    
        System.out.println("Quantos alunos existe na academia?");
            aluno = ler.nextInt();
            
            while (contador <= aluno) {
            System.out.println("Insira o peso do " + contador + " ° aluno : ");
            peso = ler.nextDouble();
            somap += peso;
            contador++;
            } 
            media = somap / aluno;
            System.out.println(media);
        
        
    }
}