public class PlanoMensal extends Matricula {
    public PlanoMensal(Aluno aluno, double mensalidadeBase) throws MensalidadeInvalidaException {
        super(aluno, mensalidadeBase);
    }

    @Override
    public double calcularMensalidade() {
        return getMensalidadeBase();
    }
}