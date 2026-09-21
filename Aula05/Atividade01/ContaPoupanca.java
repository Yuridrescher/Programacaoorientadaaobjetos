package Aula05.Atividade01;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numero, Titular titular) {
        super(numero, titular);
    }

    public void aplicarRendimento(double percentual) {
        if (percentual > 0) {
            double rendimento = saldo * (percentual / 100.0);
            saldo += rendimento;
            movimentacoes.add(rendimento);
            System.out.println("Rendimento de " + percentual + "% aplicado na poupança " + getNumero());
        }
    }
}