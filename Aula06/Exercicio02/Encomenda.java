package Aula06.Exercicio02;
public abstract class Encomenda {
    private final String codigo;
    private final Destinatario destinatario;
    private final double pesoKg;

    public Encomenda(String codigo, Destinatario destinatario, double pesoKg) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código não pode ser vazio.");
        }
        if (destinatario == null) {
            throw new IllegalArgumentException("Destinatário é obrigatório.");
        }
        if (pesoKg <= 0.0) {
            throw new IllegalArgumentException("Peso inválido: " + pesoKg + " kg. O peso deve ser maior que zero.");
        }
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.pesoKg = pesoKg;
    }

    public String getCodigo() {
        return codigo;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public abstract double calcularFrete();
}