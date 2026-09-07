package ContaBancaria05;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();
    private int proximoNumero = 1;

    public void abrirConta(Titular titular) {
        ContaBancaria novaConta = new ContaBancaria(proximoNumero, titular);
        contas.add(novaConta);
        System.out.println("Conta número " + proximoNumero + " aberta para " + titular.getNome());
        proximoNumero++;
    }

    private ContaBancaria buscarConta(int numero) {
        for (ContaBancaria c : contas) {
            if (c.getNumero() == numero) {
                return c;
            }
        }
        return null;
    }

    public void depositar(int numero, double valor) {
        ContaBancaria conta = buscarConta(numero);
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Aviso: A conta " + numero + " não existe.");
        }
    }

    public void sacar(int numero, double valor) {
        ContaBancaria conta = buscarConta(numero);
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Aviso: A conta " + numero + " não existe.");
        }
    }

    public void exibirSaldo(int numero) {
        ContaBancaria conta = buscarConta(numero);
        if (conta != null) {
            conta.exibirSaldo();
        } else {
            System.out.println("Aviso: A conta " + numero + " não existe.");
        }
    }

    public void transferir(int numeroOrigem, int numeroDestino, double valor) {
        if (numeroOrigem == numeroDestino) {
            System.out.println("Aviso: Não é possível transferir para a própria conta.");
            return;
        }

        ContaBancaria origem = buscarConta(numeroOrigem);
        ContaBancaria destino = buscarConta(numeroDestino);

        if (origem == null || destino == null) {
            System.out.println("Aviso: Uma das contas informadas para transferência não existe.");
            return;
        }

        System.out.println("\n Iniciando Transferência ");
        if (origem.sacar(valor)) { 
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " concluída com sucesso.");
        } else {
            System.out.println("Transferência cancelada por falha no saque.");
        }
        
    }
}
