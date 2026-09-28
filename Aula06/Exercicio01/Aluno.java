public class Aluno {
    private final String nome;

    public Aluno(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do aluno não pode ser vazio.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}