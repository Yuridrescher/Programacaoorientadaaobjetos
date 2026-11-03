package cantina.modelo;

import cantina.excecao.PrecoInvalidoException;

public class ProdutoPromocional implements Produto {
    private String nome;
    private double precoBase;

    public ProdutoPromocional(String nome, double precoBase) {
        if (precoBase < 0) {
            throw new PrecoInvalidoException("Erro: O preco do produto '" + nome + "' nao pode ser negativo.");
        }
        this.nome = nome;
        this.precoBase = precoBase;
    }

    @Override
    public String getNome() {
        return nome + " (PROMO)";
    }

    @Override
    public double getPreco() {
        return precoBase * 0.80;
    }
}
