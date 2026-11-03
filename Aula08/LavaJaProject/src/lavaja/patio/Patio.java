package lavaja.patio;

import lavaja.servico.Servico;
import java.util.ArrayList;
import java.util.List;

public class Patio {
    private List<Servico> servicosDoDia = new ArrayList<>();

    public void adicionarServico(Servico servico) {
        servicosDoDia.add(servico);
    }

    public double calcularFaturamentoTotal() {
        double total = 0;
        for (Servico s : servicosDoDia) {
            total += s.calcularPrecoFinal();
        }
        return total;
    }

    public Servico buscarServicoMaisCaro() {
        if (servicosDoDia.isEmpty()) return null;
        
        Servico maisCaro = servicosDoDia.get(0);
        for (Servico s : servicosDoDia) {
            if (s.calcularPrecoFinal() > maisCaro.calcularPrecoFinal()) {
                maisCaro = s;
            }
        }
        return maisCaro;
    }
}
