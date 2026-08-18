package poo.semana03.atividade01;

public class Pedido {
    Cliente cliente;
    Produto produto;
    int quantidade;
    double percentualDesconto;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.percentualDesconto = 0.0;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            this.percentualDesconto = percentual;
        } else {
            System.out.println("Erro: O desconto deve ser entre 0 e 100%.");
        }
    }

    public void resumo() {
        double valorSemDesconto = produto.preco * quantidade;
        double valorDesconto = valorSemDesconto * (percentualDesconto / 100);
        double valorTotal = valorSemDesconto - valorDesconto;

        System.out.println("RESUMO DO PEDIDO");
        System.out.println("Cliente: " + cliente.nome + " (" + cliente.email + ")");
        System.out.println("Produto: " + produto.nome + " | Qtd: " + quantidade);
        
        if (percentualDesconto > 0) {
            System.out.println("Desconto aplicado: " + percentualDesconto + "%");
        }
        
        System.out.printf("Valor Total: R$ %.2f\n", valorTotal);
        
    }
}
