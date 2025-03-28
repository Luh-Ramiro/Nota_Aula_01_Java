package Questao04;

public class Banco {

        String titular;
        double saldo;


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

        public void transferir(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                saldo += valor;
                System.out.println("Transferência de R$ " + String.format("%.2f", valor) + " para " + " realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente ou valor inválido.");
            }
        }
    }

