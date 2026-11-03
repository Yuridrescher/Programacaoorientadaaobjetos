package lavaja.servico;

import lavaja.modelo.Veiculo;
import lavaja.excecao.RegraLavaJaException;
import java.time.LocalDate;

public class LavagemComCera extends Servico {
    private double valorCera;

    public LavagemComCera(Veiculo veiculo, LocalDate data, double precoBase, double valorCera) {
        super(veiculo, data, precoBase);
        if (valorCera < 0) {
            throw new RegraLavaJaException("Erro no sistema: O valor da cera não pode ser negativo.");
        }
        this.valorCera = valorCera;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + valorCera;
    }
}
