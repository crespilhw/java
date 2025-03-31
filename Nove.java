import java.util.Scanner;

public class Algoritmo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int horaEntrada, minutoEntrada, totalMinutosEntrada, minutoSaida, horaSaida, totalMinutosSaida, totalMinutosEstacionamento, horasAdicionais;
        double valorPago;

    
        System.out.print("Digite a hora de entrada (0-23): ");
         horaEntrada = ler.nextInt();
        System.out.print("Digite os minutos de entrada (0-59): ");
         minutoEntrada = ler.nextInt();

      
        System.out.print("Digite a hora de saída (0-23): ");
         horaSaida = ler.nextInt();
        System.out.print("Digite os minutos de saída (0-59): ");
         minutoSaida = ler.nextInt();

         totalMinutosEntrada = horaEntrada * 60 + minutoEntrada;
         totalMinutosSaida = horaSaida * 60 + minutoSaida;

        
        if (totalMinutosSaida < totalMinutosEntrada) {
            totalMinutosSaida += 24 * 60; 
        }

         totalMinutosEstacionamento = totalMinutosSaida - totalMinutosEntrada;

        
         valorPago = 0;

        if (totalMinutosEstacionamento <= 60) {
            valorPago = 4.00; 
        } else if (totalMinutosEstacionamento <= 120) {
            valorPago = 6.00; 
        } else {
           
            horasAdicionais = (totalMinutosEstacionamento - 120 + 59) / 60; 
            valorPago = 6.00 + (horasAdicionais * 1.00); 
        }
        System.out.printf("O valor a ser pago pelo estacionamento é: R$ " + valorPago);
    }
}