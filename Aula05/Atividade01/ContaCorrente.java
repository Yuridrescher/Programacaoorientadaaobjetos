package Aula05.Atividade01;

public class ContaCorrente extends ContaBancaria {
    private static final double TARIFA = 0.50;

    public ContaCorrente(int numero, Titular titular) {
        super(numero, titular);
    }

    @Override
    public boolean sacar(double valor) {
        double total = valor + TARIFA;
        if (valor > 0 && total <= saldo) {
            saldo -= total;
            movimentacoes.add(-total);
            System.out.println("Saque de R$ " + valor + " com tarifa de R$ " + TARIFA + " na conta corrente " + getNumero());
            return true;
        }
        System.out.println("Saldo insuficiente para saque com tarifa na conta corrente " + getNumero());
        return false;
    }
}