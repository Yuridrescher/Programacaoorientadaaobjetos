package frotalog.modelo;

public class Caminhao implements Entregavel {
    private String placa;
    private double toneladas;

    public Caminhao(String placa, double quilos) {
        this.placa = placa;
        this.toneladas = quilos / 1000.0;
    }

    @Override
    public boolean aceitaDistancia(double distancia) {
        return true;
    }

    @Override
    public double calcularCusto(double distancia) {
        return (CUSTO_BASE_KM * distancia) + (0.50 * distancia * toneladas);
    }

    @Override
    public String getPlaca() { return placa; }
}
