public class Principal {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Yuri";
        c1.saldo = 1000.0;

        ContaBancaria c2 = new ContaBancaria();
        c2.titular = "João";
        c2.saldo = 500.0;

        c1.depositar(200.0);
        c1.sacar(100.0);
        
        c2.depositar(300.0);
        c2.sacar(1000.0); 

        c1.transferir(c2, 400.0);

        c1.exibirSaldo();
        c2.exibirSaldo();
    }
}
