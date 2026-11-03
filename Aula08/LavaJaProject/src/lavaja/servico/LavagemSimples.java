package lavaja.servico;

import lavaja.modelo.Veiculo;
import lavaja.modelo.Porte;
import java.time.LocalDate;

public class LavagemSimples extends Servico {
    public LavagemSimples(Veiculo veiculo, LocalDate data, double precoBase) {
        super(veiculo, data, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        if (getVeiculo().getPorte() == Porte.GRANDE) {
            return getPrecoBase() + 15.0;
        }
        return getPrecoBase();
    }
}
