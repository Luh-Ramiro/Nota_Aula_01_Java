import java.util.Scanner;

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual de " + titular + ": R$ " + String.format("%.2f", saldo));
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void transferir(double valor, ContaBancaria contaDestino) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência de R$ " + String.format("%.2f", valor) + " para " + contaDestino.titular + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria("Cliente 1");
        ContaBancaria conta2 = new ContaBancaria("Cliente 2");

        while (true) {
            System.out.println("\n=== Sistema Bancário ===");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta1.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    conta1.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double saque = scanner.nextDouble();
                    conta1.sacar(saque);
                    break;
                case 4:
                    System.out.print("Digite o valor para transferência: ");
                    double transferencia = scanner.nextDouble();
                    conta1.transferir(transferencia, conta2);
                    break;
                case 5:
                    System.out.println("Obrigado por usar o sistema bancário!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
