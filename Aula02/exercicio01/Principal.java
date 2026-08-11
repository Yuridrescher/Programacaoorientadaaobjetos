public class Principal {

    public static void main(String[] args) {
        // 4. Instanciando 3 produtos com new
        Produto p1 = new Produto();
        p1.nome = "Macbook Pro";
        p1.preco = 12000.00;
        p1.estoque = 5;

        Produto p2 = new Produto();
        p2.nome = "PC Desktop Windows";
        p2.preco = 4500.00;
        p2.estoque = 10;

        Produto p3 = new Produto();
        p3.nome = "Monitor Ultrawide";
        p3.preco = 1800.00;
        p3.estoque = 1;

        System.out.println("REALIZANDO VENDAS");
        
        p1.vender(2);
        
    
        p3.vender(2); 

        System.out.println("\nCATÁLOGO ATUALIZADO");
        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();
    }
}
