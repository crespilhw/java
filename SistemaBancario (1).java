import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nContas = 5;
        String[] nomes = new String[nContas];
        double[] saldos = new double[nContas];
        int[] contas = new int[nContas];
        int numeroConta = 1001;

        for (int i = 0; i < nContas; i++) {
            contas[i] = -1;
        }

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 1:
                    boolean contaCriada = false;
                    for (int i = 0; i < nContas; i++) {
                        if (contas[i] == -1) {
                            System.out.print("Digite seu nome: ");
                            nomes[i] = ler.nextLine();
                            contas[i] = numeroConta++;
                            saldos[i] = 0.0;
                            System.out.println("Conta criada com sucesso! Número da conta: " + contas[i]);
                            contaCriada = true;
                            break;
                        }
                    }
                    if (!contaCriada) {
                        System.out.println("Limite de contas atingido.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o número da conta: ");
                    int contaDeposito = ler.nextInt();
                    ler.nextLine();
                    boolean contaEncontrada = false;
                    for (int i = 0; i < nContas; i++) {
                        if (contas[i] == contaDeposito) {
                            System.out.print("Digite o valor a ser depositado: ");
                            double valorDeposito = ler.nextDouble();
                            saldos[i] += valorDeposito;
                            System.out.println("Depósito realizado com sucesso!");
                            contaEncontrada = true;
                            break;
                        }
                    }
                    if (!contaEncontrada) {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o número da conta: ");
                    int contaSaque = ler.nextInt();
                    ler.nextLine();
                    boolean contaSaqueEncontrada = false;
                    for (int i = 0; i < nContas; i++) {
                        if (contas[i] == contaSaque) {
                            System.out.print("Digite o valor a ser sacado: ");
                            double valorSaque = ler.nextDouble();
                            if (saldos[i] >= valorSaque) {
                                saldos[i] -= valorSaque;
                                System.out.println("Saque realizado com sucesso!");
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                            contaSaqueEncontrada = true;
                            break;
                        }
                    }
                    if (!contaSaqueEncontrada) {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número da conta: ");
                    int contaConsulta = ler.nextInt();
                    ler.nextLine();
                    boolean contaConsultaEncontrada = false;
                    for (int i = 0; i < nContas; i++) {
                        if (contas[i] == contaConsulta) {
                            System.out.println("Saldo da conta " + contaConsulta + ": R$ " + saldos[i]);
                            contaConsultaEncontrada = true;
                            break;
                        }
                    }
                    if (!contaConsultaEncontrada) {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    ler.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}