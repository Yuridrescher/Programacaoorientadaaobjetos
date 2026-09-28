public class PlanoFamilia extends Matricula {
    private final int pessoasExtras;

    public PlanoFamilia(Aluno aluno, double mensalidadeBase, int pessoasExtras) throws MensalidadeInvalidaException {
        super(aluno, mensalidadeBase);
        if (pessoasExtras < 1 || pessoasExtras > 4) {
            throw new IllegalArgumentException("O plano família aceita apenas de 1 a 4 pessoas extras. Informado: " + pessoasExtras);
        }
        this.pessoasExtras = pessoasExtras;
    }

    public int getPessoasExtras() {
        return pessoasExtras;
    }

    @Override
    public double calcularMensalidade() {
        return getMensalidadeBase() + (pessoasExtras * 40.0);
    }
}