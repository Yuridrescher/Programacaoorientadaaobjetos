package cantina.visao;

import cantina.modelo.Produto;
import cantina.modelo.Venda;

public class CupomCompleto implements ImpressoraCupom {
    @Override
    public void imprimir(Venda venda) {
        System.out.println("=== CUPOM FISCAL COMPLETO ===");
        for (Produto p : venda.getProdutos()) {
            System.out.printf("%s - R$ %.2f
", p.getNome(), p.getPreco());
        }
        System.out.printf("TOTAL DA VENDA: R$ %.2f
", venda.calcularTotal());
        System.out.println("=============================");
    }
}
