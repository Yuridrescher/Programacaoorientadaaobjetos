package Aula05.Atividade02;

import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void contratar(Funcionario f) {
        funcionarios.add(f);
    }

    public double fecharFolha() {
        double total = 0.0;
        for (Funcionario f : funcionarios) {
            total += f.salarioDoMes();
        }
        return total;
    }

    public void aumentoGeral(double percentual) {
        for (Funcionario f : funcionarios) {
            f.aplicarAumento(percentual);
        }
    }
}