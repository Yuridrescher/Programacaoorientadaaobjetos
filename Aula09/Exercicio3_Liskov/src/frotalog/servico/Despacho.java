package frotalog.servico;

import frotalog.modelo.Entregavel;
import java.util.ArrayList;
import java.util.List;

public class Despacho {
    private List<Entregavel> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Entregavel e) {
        veiculos.add(e);
    }

    public double processarEntregas(double distancia) {
        double total = 0;
        for (Entregavel v : veiculos) {
            if (v.aceitaDistancia(distancia)) {
                total += v.calcularCusto(distancia);
                System.out.println("Veiculo " + v.getPlaca() + " alocado.");
            } else {
                System.out.println("Veiculo " + v.getPlaca() + " recusou a entrega (limite excedido).");
            }
        }
        return total;
    }
}
