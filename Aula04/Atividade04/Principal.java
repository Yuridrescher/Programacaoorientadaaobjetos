package ContaBancaria05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao = -1;

        System.out.println("--- Sistema Bancário ---");

        while (opcao != 0) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Ver extrato");
            System.out.println("7 - Aplicar rendimento");
            System.out.println("8 - Listar contas");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Opção inválida. Digite um número inteiro.");
                scanner.nextLine(); 
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Titular: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Data de Nascimento: ");
                    String data = scanner.nextLine();
                    
                    Titular titular = new Titular(nome, cpf, data);
                    banco.abrirConta(titular);
                    break;
                case 2:
                    System.out.print("Número da Conta: ");
                    int numSac = scanner.nextInt();
                    System.out.print("Valor do Saque: ");
                    double valorSac = scanner.nextDouble();
                    banco.sacar(numSac, valorSac);
                    break;
                case 3:
                    System.out.print("Número da Conta: ");
                    int numDep = scanner.nextInt();
                    System.out.print("Valor do Depósito: ");
                    double valorDep = scanner.nextDouble();
                    banco.depositar(numDep, valorDep);
                    break;
                case 4:
                    System.out.print("Conta de Origem: ");
                    int origem = scanner.nextInt();
                    System.out.print("Conta de Destino: ");
                    int destino = scanner.nextInt();
                    System.out.print("Valor da Transferência: ");
                    double valorTransf = scanner.nextDouble();
                    banco.transferir(origem, destino, valorTransf);
                    break;
                case 5:
                    System.out.print("Número da Conta: ");
                    int numSaldo = scanner.nextInt();
                    banco.exibirSaldo(numSaldo);
                    break;
                case 6:
                    System.out.print("Número da Conta: ");
                    int numExtrato = scanner.nextInt();
                    banco.exibirExtrato(numExtrato);
                    break;
                case 7:
                    System.out.print("Número da Conta: ");
                    int numRendimento = scanner.nextInt();
                    System.out.print("Percentual de Rendimento (%): ");
                    double percentual = scanner.nextDouble();
                    banco.aplicarRendimento(numRendimento, percentual);
                    break;
                case 8:
                    banco.listarContas();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
    }
}
