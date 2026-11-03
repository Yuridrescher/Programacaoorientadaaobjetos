package escola.persistencia;

import escola.modelo.Aluno;

public class RepositorioAluno {
    public void salvar(Aluno aluno) {
        System.out.println("Gravando dados do aluno " + aluno.getNome() + " no sistema de arquivos...");
    }
}
