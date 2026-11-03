package lavaja.servico;

import lavaja.modelo.Veiculo;
import java.time.LocalDate;

public class HigienizacaoInterna extends Servico {
    private boolean entregaMesmoDia;

    public HigienizacaoInterna(Veiculo veiculo, LocalDate data, double precoBase, boolean entregaMesmoDia) {
        super(veiculo, data, precoBase);
        this.entregaMesmoDia = entregaMesmoDia;
    }

    @Override
    public double calcularPrecoFinal() {
        if (entregaMesmoDia) {
            return getPrecoBase() * 2;
        }
        return getPrecoBase();
    }
}
