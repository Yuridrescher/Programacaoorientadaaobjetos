package frotalog.modelo;

public class Moto implements Entregavel {
    private String placa;

    public Moto(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean aceitaDistancia(double distancia) {
        return true;
    }

    @Override
    public double calcularCusto(double distancia) {
        return (CUSTO_BASE_KM / 2) * distancia;
    }

    @Override
    public String getPlaca() { return placa; }
}
