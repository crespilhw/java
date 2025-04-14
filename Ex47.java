import java.util.Scanner;
public class Ex47
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int voto, c1 = 0 ,c2 = 0, c3 = 0, zero;
	    
		System.out.println("Opções de voto: 1, 2, 3 ou 0 para encerrar");
		do {
		System.out.println("Vote: ");
		voto = ler.nextInt();
		
		if (voto == 1) c1++; 
		else if (voto == 2) c2++;
		else if (voto == 3) c3++;
		
		} while (voto != 0);  
		
		System.out.println("\nResultado:");
        System.out.println("Candidato 1: " + c1 + " votos");
        System.out.println("Candidato 2: " + c2 + " votos");
        System.out.println("Candidato 3: " + c3 + " votos");
        
        if (c1 > c2 && c1 > c3)
        System.out.println("Vencedor: Candidato 1");
        else if (c2 > c1 && c2 > c3)
        System.out.println("Vencedor: Candidato 2");
        else if (c3 > c1 && c3 > c2)
        System.out.println("Vencedor: Candidato 3");
        else
        System.out.println("Houve empate!");

        
		
	}
}
