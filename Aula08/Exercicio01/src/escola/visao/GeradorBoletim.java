package escola.visao;

import escola.modelo.Aluno;
import escola.negocio.CalculadoraMedia;

public class GeradorBoletim {
    public void imprimir(Aluno aluno, CalculadoraMedia calculadora) {
        double media = calculadora.calcular(aluno);
        String situacao = calculadora.obterSituacao(media);

        System.out.println("-------------------------");
        System.out.println("BOLETIM ESCOLAR");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Media Final: " + media);
        System.out.println("Situacao: " + situacao);
        System.out.println("-------------------------");
    }
}
