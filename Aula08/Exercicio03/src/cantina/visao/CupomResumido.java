package cantina.visao;

import cantina.modelo.Venda;

public class CupomResumido implements ImpressoraCupom {
    @Override
    public void imprimir(Venda venda) {
        System.out.println("=== RECIBO SIMPLES ===");
        System.out.println("Itens comprados: " + venda.getProdutos().size());
        System.out.printf("Valor Total: R$ %.2f
", venda.calcularTotal());
        System.out.println("======================");
    }
}
