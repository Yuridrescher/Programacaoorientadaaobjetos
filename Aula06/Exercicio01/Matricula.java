public abstract class Matricula {
    private final Aluno aluno;
    private final double mensalidadeBase;

    public Matricula(Aluno aluno, double mensalidadeBase) throws MensalidadeInvalidaException {
        if (aluno == null) {
            throw new IllegalArgumentException("O aluno da matrícula é obrigatório.");
        }
        if (mensalidadeBase < 80.0) {
            throw new MensalidadeInvalidaException("A mensalidade base não pode ser inferior a R$ 80,00. Informado: " + mensalidadeBase);
        }
        this.aluno = aluno;
        this.mensalidadeBase = mensalidadeBase;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public double getMensalidadeBase() {
        return mensalidadeBase;
    }

    public abstract double calcularMensalidade();
}