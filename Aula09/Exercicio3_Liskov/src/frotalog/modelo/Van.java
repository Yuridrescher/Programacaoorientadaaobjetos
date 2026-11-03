package frotalog.modelo;

public class Van implements Entregavel {
    private String placa;

    public Van(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean aceitaDistancia(double distancia) {
        return true;
    }

    @Override
    public double calcularCusto(double distancia) {
        return CUSTO_BASE_KM * distancia;
    }

    @Override
    public String getPlaca() { return placa; }
}
