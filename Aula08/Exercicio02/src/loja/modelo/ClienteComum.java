package loja.modelo;

public class ClienteComum implements CategoriaCliente {
    @Override
    public double calcularDesconto(double valorOriginal) {
        return valorOriginal;
    }
}
