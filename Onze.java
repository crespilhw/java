import java.util.Scanner;
public class Onze {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldoMedio, credito;


      System.out.print("Digite o saldo médio do cliente: R$ ");
        saldoMedio = ler.nextDouble();

       credito = 0;
        if (saldoMedio >= 0 && saldoMedio <= 200) {
            credito = 0; 
        } else if (saldoMedio >= 201 && saldoMedio <= 400) {
            credito = saldoMedio * 0.20; 
        } else if (saldoMedio >= 401 && saldoMedio <= 600) {
            credito = saldoMedio * 0.30; 
        } else if (saldoMedio > 600) {
            credito = saldoMedio * 0.40; 
        } else {
            System.out.println("Saldo médio inválido.");
        }

        System.out.println("Saldo médio: R$ " + saldoMedio);
        System.out.println("Valor do crédito: R$ " + credito);
    }
}