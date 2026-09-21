package Aula05.Atividade01;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();
    private int proximoNumero = 1;

    public void abrirContaCorrente(Titular titular) {
        ContaCorrente novaConta = new ContaCorrente(proximoNumero, titular);
        contas.add(novaConta);
        System.out.println("Conta Corrente nº " + proximoNumero + " aberta para " + titular.getNome());
        proximoNumero++;
    }

    public void abrirContaPoupanca(Titular titular) {
        ContaPoupanca novaConta = new ContaPoupanca(proximoNumero, titular);
        contas.add(novaConta);
        System.out.println("Conta Poupança nº " + proximoNumero + " aberta para " + titular.getNome());
        proximoNumero++;
    }

    public void abrirContaUniversitaria(Titular titular) {
        ContaUniversitaria novaConta = new ContaUniversitaria(proximoNumero, titular);
        contas.add(novaConta);
        System.out.println("Conta Universitária nº " + proximoNumero + " aberta para " + titular.getNome());
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

    public void aplicarRendimento(int numero, double percentual) {
        ContaBancaria conta = buscarConta(numero);
        if (conta == null) {
            System.out.println("Aviso: A conta " + numero + " não existe.");
            return;
        }
        if (conta instanceof ContaPoupanca) {
            ((ContaPoupanca) conta).aplicarRendimento(percentual);
        } else {
            System.out.println("Aviso: Apenas Conta Poupança possui rendimento.");
        }
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Aviso: Nenhuma conta cadastrada no banco.");
            return;
        }
        System.out.println("\n--- Lista de Contas Cadastradas ---");
        for (ContaBancaria c : contas) {
            String tipo = c.getClass().getSimpleName();
            System.out.println("Conta nº: " + c.getNumero() + " [" + tipo + "] | Titular: " + c.getTitular().getNome() + " | Saldo: R$ " + c.getSaldo());
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
            System.out.println("Aviso: Uma das contas informadas não existe.");
            return;
        }

        if (origem.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " concluída com sucesso.");
        } else {
            System.out.println("Transferência cancelada por falha no débito.");
        }
    }

    public void sacarCinquentaDeTodas() {
        if (contas.isEmpty()) {
            System.out.println("Aviso: Nenhuma conta cadastrada.");
            return;
        }
        for (ContaBancaria c : contas) {
            c.sacar(50.0);
            c.exibirSaldo();
        }
    }
}