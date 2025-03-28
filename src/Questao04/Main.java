package Questao04;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Banco conta1 = new Banco();

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
                    conta1.transferir(transferencia);
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



