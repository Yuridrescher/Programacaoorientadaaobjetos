package loja.modelo;

public class ClientePrata implements CategoriaCliente {
    @Override
    public double calcularDesconto(double valorOriginal) {
        return valorOriginal * 0.95;
    }
}
