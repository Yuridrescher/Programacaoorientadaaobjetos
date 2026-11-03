package loja.modelo;

public class ClienteDiamante implements CategoriaCliente {
    @Override
    public double calcularDesconto(double valorOriginal) {
        return valorOriginal * 0.85;
    }
}
