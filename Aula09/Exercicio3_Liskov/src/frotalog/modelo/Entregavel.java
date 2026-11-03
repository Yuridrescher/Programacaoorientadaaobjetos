package frotalog.modelo;

public interface Entregavel {
    double CUSTO_BASE_KM = 2.0;
    
    boolean aceitaDistancia(double distancia);
    double calcularCusto(double distancia);
    String getPlaca();
}
