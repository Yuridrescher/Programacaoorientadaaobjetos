package Aula06.Exercicio02;
public class EncomendaExpressa extends Encomenda {
    public EncomendaExpressa(String codigo, Destinatario destinatario, double pesoKg) 
            throws PesoExcedidoParaEntregaExpressaException {
        super(codigo, destinatario, pesoKg);
        if (pesoKg > 10.0) {
            throw new PesoExcedidoParaEntregaExpressaException("Serviço expresso só aceita até 10 kg. Informado: " + pesoKg + " kg.");
        }
    }

    @Override
    public double calcularFrete() {
        return (getPesoKg() * 1.20) + 15.00;
    }
}