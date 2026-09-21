package Aula05.Atividade01;

public class ContaUniversitaria extends ContaBancaria {
    private static final double LIMITE_SAQUE = 300.0;

    public ContaUniversitaria(int numero, Titular titular) {
        super(numero, titular);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > LIMITE_SAQUE) {
            System.out.println("Saque recusado: limite máximo de R$ " + LIMITE_SAQUE + " excedido");
            return false;
        }
        return super.sacar(valor);
    }
}