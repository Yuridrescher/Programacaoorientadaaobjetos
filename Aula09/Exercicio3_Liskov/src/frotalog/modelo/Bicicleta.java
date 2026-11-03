package frotalog.modelo;

public class Bicicleta implements Entregavel {
    private String identificador;

    public Bicicleta(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public boolean aceitaDistancia(double distancia) {
        return distancia <= 5.0;
    }

    @Override
    public double calcularCusto(double distancia) {
        if (!aceitaDistancia(distancia)) {
            throw new IllegalArgumentException("Distancia excede o limite da bicicleta");
        }
        return 1.0 * distancia;
    }

    @Override
    public String getPlaca() { return identificador; }
}
