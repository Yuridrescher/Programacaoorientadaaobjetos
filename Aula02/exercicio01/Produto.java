public class Produto {
    String nome;
    double preco;
    int estoque;

    public void exibirInfo() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Estoque atual: " + estoque);
    }

    public void vender(int qtd) {
        if (qtd <= estoque) {
            estoque = estoque - qtd; // Reduz o estoque
            System.out.println(" Venda de " + qtd + " unidade(s) de '" + nome + "' realizada!");
        } else {
            System.out.println(" Erro: Estoque insuficiente de '" + nome + "'! Tentativa de venda: " + qtd + " | Em estoque: " + estoque);
        }
    }
}
