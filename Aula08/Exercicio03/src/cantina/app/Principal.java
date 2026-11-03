package cantina.app;

import cantina.modelo.*;
import cantina.visao.*;
import cantina.caixa.FechamentoCaixa;
import cantina.excecao.PrecoInvalidoException;

public class Principal {
    public static void main(String[] args) {
        FechamentoCaixa caixa = new FechamentoCaixa();
        ImpressoraCupom impressoraCompleta = new CupomCompleto();
        ImpressoraCupom impressoraResumida = new CupomResumido();

        Venda venda1 = new Venda();
        venda1.adicionarProduto(new ProdutoComum("Pastel", 5.0));
        venda1.adicionarProduto(new ProdutoComum("Refrigerante", 4.0));
        caixa.registrarVenda(venda1);
        impressoraCompleta.imprimir(venda1);

        Venda venda2 = new Venda();
        venda2.adicionarProduto(new ProdutoPromocional("Combo Lanche", 15.0));
        caixa.registrarVenda(venda2);
        impressoraResumida.imprimir(venda2);

        try {
            Produto invalido = new ProdutoComum("Doce", -2.0);
        } catch (PrecoInvalidoException e) {
            System.out.println("
[ERRO CAPTURADO] " + e.getMessage());
        }

        System.out.println("
--- FECHAMENTO DO DIA ---");
        System.out.printf("Faturamento: R$ %.2f
", caixa.getFaturamentoTotal());
        
        Venda maior = caixa.getMaiorVenda();
        if (maior != null) {
            System.out.printf("Maior venda do dia foi de: R$ %.2f
", maior.calcularTotal());
        }
    }
}
