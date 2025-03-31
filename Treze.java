import java.util.Scanner;
public class Treze {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double largura, comprimento, area;
        String classificacao;


        System.out.print("Digite a largura do terreno em metros: ");
        largura = ler.nextDouble();
        System.out.print("Digite o comprimento do terreno em metros: ");
        comprimento = ler.nextDouble();

         area = largura * comprimento;

        System.out.println("A área do terreno é: " + area);

        if (area < 100) {
            classificacao = "TERRENO POPULAR";
        } else if (area >= 100 && area <= 500) {
            classificacao = "TERRENO MASTER";
        } else {
            classificacao = "TERRENO VIP";
        }

        System.out.println("Classificação do terreno: " + classificacao);
    }
}