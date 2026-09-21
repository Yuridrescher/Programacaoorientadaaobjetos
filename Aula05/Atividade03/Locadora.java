package Aula05.Atividade03;

import java.util.ArrayList;

public class Locadora {
    private ArrayList<Veiculo> frota = new ArrayList<>();
    private double faturamento = 0.0;

    public void cadastrarVeiculo(Veiculo v) {
        frota.add(v);
    }

    public double getFaturamento() {
        return faturamento;
    }

    public boolean alugar(String placa, int dias) {
        if (dias <= 0) {
            System.out.println("Erro: Quantidade de dias inválida (" + dias + ").");
            return false;
        }

        for (Veiculo v : frota) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                double valor = v.calcularAluguel(dias);
                faturamento += valor;
                System.out.println("Aluguer concluído: " + v.getModelo() + " (" + v.getPlaca() + ") por " + dias + " dias. Valor: R$ " + valor);
                return true;
            }
        }

        System.out.println("Erro: Veículo com a matrícula/placa " + placa + " não encontrado.");
        return false;
    }
}