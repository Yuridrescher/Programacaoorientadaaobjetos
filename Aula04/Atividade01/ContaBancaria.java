package ContaBancaria05;
import java.util.ArrayList;

public class ContaBancaria {
    private int numero;
    private Titular titular;
    private double saldo;
    private ArrayList<Double> movimentacoes = new ArrayList<>();

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

    public void setTitular(String novoNome) {
        if (this.titular != null) {
            this.titular.setNome(novoNome);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Double> getOperacoes() {
       
        return new ArrayList<>(movimentacoes);
    }

    void exibirExtrato() {
        for(Double mov : movimentacoes) {
            System.out.println("Movimentacao: " + mov);
        }
    }

    void mostrarTotalDepositado() {
        Double valorTotal = 0.00;
        for(Double mov : movimentacoes) {
            if (mov > 0) {
                valorTotal += mov;
            }
        }
        System.out.println("Total Depositado: " + valorTotal);
    }

    void mostrarMaiorSaque() {
        if (movimentacoes.isEmpty()) return;
        
        Double maiorSaque = movimentacoes.get(0);
        for(Double mov : movimentacoes) {
            if(mov < maiorSaque) {
                maiorSaque = mov;
            }
        }
        System.out.println("Maior Saque: " + maiorSaque);
    }
     
    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido na conta de " + titular.getNome() + ": R$ " + valor);
        } else {
            saldo = saldo + valor;
            movimentacoes.add(valor);
            System.out.println("Depósito de R$ " + valor + " na conta de " + titular.getNome());
        }
    }

    boolean sacar(double valor) {
        double custo = valor + 0.50;
        if (custo > saldo) {
            System.out.println("Saldo insuficiente na conta de " + titular.getNome()
                    + ": saque R$ " + valor + " mais tarifa, saldo R$ " + saldo);
            return false;
        } else {
            saldo = saldo - custo;
            movimentacoes.add(valor * -1);
            System.out.println("Saque de R$ " + valor + " (tarifa R$ 0.50) na conta de " + titular.getNome());
            return true;
        }
    }

    void aplicarRendimento(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual inválido: " + percentual);
        } else {
            saldo = saldo + saldo * percentual / 100;
            System.out.println("Rendimento de " + percentual + "% na conta de " + titular.getNome());
        }
    }

    void exibirSaldo() {
        System.out.println("Conta " + numero + " (" + titular.getNome() + "): R$ " + saldo 
        + " em " + movimentacoes.size() + " transações");
    }
}
