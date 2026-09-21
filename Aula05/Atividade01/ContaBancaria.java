package Aula05.Atividade01;

import java.util.ArrayList;

public class ContaBancaria {
    private int numero;
    private Titular titular;
    protected double saldo;
    protected ArrayList<Double> movimentacoes = new ArrayList<>();

    public ContaBancaria(int numero, Titular titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public ContaBancaria(int numero, Titular titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        if (saldoInicial < 0) {
            System.out.println("Saldo inicial negativo recusado. Iniciando com R$ 0.0");
            this.saldo = 0.0;
        } else {
            this.saldo = saldoInicial;
            if (saldoInicial > 0) {
                movimentacoes.add(saldoInicial);
            }
        }
    }

    public int getNumero() {
        return numero;
    }

    public Titular getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            movimentacoes.add(valor);
            System.out.println("Depósito de R$ " + valor + " realizado na conta " + numero);
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            movimentacoes.add(-valor);
            System.out.println("Saque de R$ " + valor + " realizado na conta " + numero);
            return true;
        }
        System.out.println("Saldo insuficiente ou valor inválido na conta " + numero);
        return false;
    }

    public void exibirSaldo() {
        System.out.println("Conta " + numero + " (" + titular.getNome() + "): R$ " + saldo);
    }
}