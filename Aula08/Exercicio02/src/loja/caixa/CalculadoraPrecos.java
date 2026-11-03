package loja.caixa;

import loja.modelo.CategoriaCliente;

public class CalculadoraPrecos {
    public double processarPagamento(double valorOriginal, CategoriaCliente categoria) {
        return categoria.calcularDesconto(valorOriginal);
    }
}
