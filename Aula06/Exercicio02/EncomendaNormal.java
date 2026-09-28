package Aula06.Exercicio02;
public class EncomendaNormal extends Encomenda {
    public EncomendaNormal(String codigo, Destinatario destinatario, double pesoKg) {
        super(codigo, destinatario, pesoKg);
    }

    @Override
    public double calcularFrete() {
        return getPesoKg() * 1.20;
    }
}