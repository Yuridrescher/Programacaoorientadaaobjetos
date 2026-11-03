package lavaja.servico;

import lavaja.modelo.Veiculo;
import lavaja.excecao.RegraLavaJaException;
import java.time.LocalDate;

public abstract class Servico {
    private Veiculo veiculo;
    private LocalDate data;
    private double precoBase;

    public Servico(Veiculo veiculo, LocalDate data, double precoBase) {
        if (veiculo == null) {
            throw new RegraLavaJaException("Erro no sistema: Um serviço não pode existir sem um veículo vinculado.");
        }
        if (precoBase < 0) {
            throw new RegraLavaJaException("Erro no sistema: O preço base de um serviço não pode ser negativo.");
        }
        
        this.veiculo = veiculo;
        this.data = data;
        this.precoBase = precoBase;
    }

    public Veiculo getVeiculo() { return veiculo; }
    public LocalDate getData() { return data; }
    public double getPrecoBase() { return precoBase; }

    public abstract double calcularPrecoFinal();
}
