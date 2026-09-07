package ContaBancaria05;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao = 0;

        System.out.println(" Sistema Bancário");

        while (opcao != 6) {
            System.out.println("\n Escolha uma opção:");
            System.out.println("1 - Abrir Conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Exibir Saldo");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 

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
                    int numDep = scanner.nextInt();
                    System.out.print("Valor do Depósito: ");
                    double valorDep = scanner.nextDouble();
                    banco.depositar(numDep, valorDep);
                    break;
                case 3:
                    System.out.print("Número da Conta: ");
                    int numSac = scanner.nextInt();
                    System.out.print("Valor do Saque: ");
                    double valorSac = scanner.nextDouble();
                    banco.sacar(numSac, valorSac);
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
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
    }
}
