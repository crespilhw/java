import java.util.Scanner;
public class Ex009 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int area; 
        System.out.println("Insira a área em m²: ");
        area = ler.nextInt();

        int litros = (area + 2) / 3;      
        int latas = (litros + 17) / 18;   
        int preco = latas * 80;

        System.out.println("Latas necessárias: " + latas);
        System.out.println("Preço total: R$ " + preco);
    }
}