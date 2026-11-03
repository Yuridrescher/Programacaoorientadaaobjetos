package escola.negocio;

import escola.modelo.Aluno;

public class CalculadoraMedia {
    public double calcular(Aluno aluno) {
        double soma = 0;
        for (double nota : aluno.getNotas()) {
            soma += nota;
        }
        return aluno.getNotas().isEmpty() ? 0 : soma / aluno.getNotas().size();
    }

    public String obterSituacao(double media) {
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }
}
