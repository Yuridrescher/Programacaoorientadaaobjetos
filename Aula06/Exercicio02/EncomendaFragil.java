package Aula06.Exercicio02;
public class EncomendaFragil extends Encomenda {
    public EncomendaFragil(String codigo, Destinatario destinatario, double pesoKg) {
        super(codigo, destinatario, pesoKg);
    }

    @Override
    public double calcularFrete() {
        return (getPesoKg() * 1.20) + (getPesoKg() * 0.80);
    }
}