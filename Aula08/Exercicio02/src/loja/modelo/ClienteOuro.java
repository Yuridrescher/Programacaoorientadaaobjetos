package loja.modelo;

public class ClienteOuro implements CategoriaCliente {
    @Override
    public double calcularDesconto(double valorOriginal) {
        return valorOriginal * 0.90;
    }
}
