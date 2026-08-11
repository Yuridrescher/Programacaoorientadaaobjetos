public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void exibirSaldo() {
        System.out.println(titular + " | Saldo: " + saldo);
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
        }
    }
}
