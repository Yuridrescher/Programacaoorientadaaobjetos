package cantina.modelo;

import cantina.excecao.PrecoInvalidoException;

public class ProdutoComum implements Produto {
    private String nome;
    private double preco;

    public ProdutoComum(String nome, double preco) {
        if (preco < 0) {
            throw new PrecoInvalidoException("Erro: O preco do produto '" + nome + "' nao pode ser negativo.");
        }
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
