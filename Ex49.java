/******************************************************************************

 Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota inserida, o sistema deve classificar como:

Excelente (>= 9)
Bom (>= 7)
Regular (>= 5)
Insuficiente (< 5)
*Quando o usuário digitar -1, o programa termina e exibe a média geral e a contagem de cada classificação.

*******************************************************************************/
import java.util.Scanner;
public class Ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double nota, somanota = 0.0, media;
        int ex = 0, bom = 0, reg = 0, insuf = 0, totalnotas = 0;
        
        do {
    
        System.out.println("Insira a nota (-1 para sair) : ");
        nota = scanner.nextDouble();
        
        if(nota == -1)
        break;
        
        if (nota >= 9) {
        System.out.println("Excelente");
        ex++;
        }
        else if (nota >= 7) {
        System.out.println("Bom");
        bom++;
        }
        else if (nota >= 5) {
        System.out.println("Regular");
        reg++;
        }
        else if (nota < 5) {
        System.out.println("Insuficiente");
        insuf ++;
        }
        
        somanota += nota;
        totalnotas++;
        
        } while (true);
        
        media = somanota / totalnotas;
        
        System.out.println("A média foi: " + media);
        System.out.println("Excelentes: " + ex);
        System.out.println("Bons: " + bom);
        System.out.println("Regulares: " + reg);
        System.out.println("Insuficientes: " + insuf);
        
    }
}
