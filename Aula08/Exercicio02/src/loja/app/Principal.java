package loja.app;

import loja.caixa.CalculadoraPrecos;
import loja.modelo.*;

public class Principal {
    public static void main(String[] args) {
        CalculadoraPrecos caixa = new CalculadoraPrecos();
        double valorDaCompra = 100.0;

        CategoriaCliente comum = new ClienteComum();
        CategoriaCliente prata = new ClientePrata();
        CategoriaCliente ouro = new ClienteOuro();
        CategoriaCliente diamante = new ClienteDiamante();

        System.out.println("Valor Original: R$ " + valorDaCompra);
        System.out.println("Cliente Comum: R$ " + caixa.processarPagamento(valorDaCompra, comum));
        System.out.println("Cliente Prata: R$ " + caixa.processarPagamento(valorDaCompra, prata));
        System.out.println("Cliente Ouro: R$ " + caixa.processarPagamento(valorDaCompra, ouro));
        System.out.println("Cliente Diamante: R$ " + caixa.processarPagamento(valorDaCompra, diamante));
    }
}
