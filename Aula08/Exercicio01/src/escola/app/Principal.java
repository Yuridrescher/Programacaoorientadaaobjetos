package escola.app;

import escola.modelo.Aluno;
import escola.negocio.CalculadoraMedia;
import escola.visao.GeradorBoletim;
import escola.persistencia.RepositorioAluno;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Yuri Drescher");
        aluno.adicionarNota(8.5);
        aluno.adicionarNota(7.0);

        CalculadoraMedia calculadora = new CalculadoraMedia();
        GeradorBoletim visao = new GeradorBoletim();
        RepositorioAluno repositorio = new RepositorioAluno();

        visao.imprimir(aluno, calculadora);
        repositorio.salvar(aluno);
    }
}
