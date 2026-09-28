package Aula06.Exercicio02;
public class Destinatario {
    private final String nome;

    public Destinatario(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Destinatário não pode ser vazio.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}