package escola.modelo;

import java.util.List;
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private List<Double> notas = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }
}
