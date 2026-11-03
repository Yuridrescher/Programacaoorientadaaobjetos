package lavaja.app;

import lavaja.modelo.*;
import lavaja.servico.*;
import lavaja.patio.Patio;
import lavaja.excecao.RegraLavaJaException;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Patio patio = new Patio();
        LocalDate hoje = LocalDate.now();

        Cliente cliente1 = new Cliente("Joao Silva", "99999-1111");
        Cliente cliente2 = new Cliente("Maria Souza", "99999-2222");

        Veiculo veiculo1 = new Veiculo("ABC-1234", "Fiat Uno", Porte.PEQUENO, cliente1);
        Veiculo veiculo2 = new Veiculo("XYZ-9876", "Toyota Hilux", Porte.GRANDE, cliente2);

        System.out.println("--- LAVA-JA LAVA-RAPIDO: INICIANDO O DIA ---\n");

        patio.adicionarServico(new LavagemSimples(veiculo2, hoje, 40.0));
        patio.adicionarServico(new LavagemComCera(veiculo1, hoje, 50.0, 25.0));
        patio.adicionarServico(new HigienizacaoInterna(veiculo1, hoje, 80.0, true));

        try {
            System.out.println("Tentando registrar lavagem fantasma...");
            Servico servicoInvalido = new LavagemSimples(null, hoje, 30.0);
            patio.adicionarServico(servicoInvalido);
        } catch (RegraLavaJaException e) {
            System.out.println("ALERTA CAPTURADO: " + e.getMessage() + "\n");
        }

        System.out.println("--- FECHAMENTO DO DIA ---");
        System.out.printf("Faturamento Total: R$ %.2f\n", patio.calcularFaturamentoTotal());

        Servico maisCaro = patio.buscarServicoMaisCaro();
        if (maisCaro != null) {
            System.out.println("\nServico mais caro do dia:");
            System.out.println("Veiculo: " + maisCaro.getVeiculo().getModelo() + " (Placa: " + maisCaro.getVeiculo().getPlaca() + ")");
            System.out.println("Tipo de Servico: " + maisCaro.getClass().getSimpleName());
            System.out.printf("Valor Pago: R$ %.2f\n", maisCaro.calcularPrecoFinal());
        }
    }
}
