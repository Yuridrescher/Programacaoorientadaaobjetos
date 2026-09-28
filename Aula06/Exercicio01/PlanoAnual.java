public class PlanoAnual extends Matricula {
    public PlanoAnual(Aluno aluno, double mensalidadeBase) throws MensalidadeInvalidaException {
        super(aluno, mensalidadeBase);
    }

    @Override
    public double calcularMensalidade() {
        return getMensalidadeBase() * 0.85;
    }
}