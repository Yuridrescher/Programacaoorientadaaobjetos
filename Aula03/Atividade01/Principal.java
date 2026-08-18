package poo.semana03.atividade01;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Souza", "ana@email.com");
        Cliente cliente2 = new Cliente("Carlos Lima", "carlos@email.com");

        Produto produto1 = new Produto("Teclado Mecânico", 250.00);
        Produto produto2 = new Produto("Monitor 24 polegadas", 800.00);

        Pedido pedido1 = new Pedido(cliente1, produto1, 2);
        
        Pedido pedido2 = new Pedido(cliente2, produto2, 1);
        pedido2.aplicarDesconto(15.0);

        pedido1.resumo();
        pedido2.resumo();
    }
}
