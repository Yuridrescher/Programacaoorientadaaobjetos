package Aula05.Atividade01;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Titular titular = new Titular("Yuri", "123.456.789-00", "01/01/2000");

        ContaCorrente cc = new ContaCorrente(1, titular);
        ContaPoupanca cp = new ContaPoupanca(2, titular);
        ContaUniversitaria cu = new ContaUniversitaria(3, titular);

        cc.depositar(300.0);
        cp.depositar(300.0);
        cu.depositar(300.0);

        cc.sacar(100.0);
        cp.sacar(100.0);
        cp.aplicarRendimento(10.0);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);
        contas.add(cu);

        for (ContaBancaria conta : contas) {
            conta.sacar(50.0);
            conta.exibirSaldo();
        }
    }
}