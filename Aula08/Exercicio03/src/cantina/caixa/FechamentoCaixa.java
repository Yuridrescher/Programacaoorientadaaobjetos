package cantina.caixa;

import cantina.modelo.Venda;
import java.util.ArrayList;
import java.util.List;

public class FechamentoCaixa {
    private List<Venda> vendasDoDia = new ArrayList<>();

    public void registrarVenda(Venda venda) {
        vendasDoDia.add(venda);
    }

    public double getFaturamentoTotal() {
        double faturamento = 0;
        for (Venda v : vendasDoDia) {
            faturamento += v.calcularTotal();
        }
        return faturamento;
    }

    public Venda getMaiorVenda() {
        if (vendasDoDia.isEmpty()) return null;
        
        Venda maior = vendasDoDia.get(0);
        for (Venda v : vendasDoDia) {
            if (v.calcularTotal() > maior.calcularTotal()) {
                maior = v;
            }
        }
        return maior;
    }
}
