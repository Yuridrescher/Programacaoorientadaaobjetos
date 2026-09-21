package Aula05.Atividade03;

public class Carro extends Veiculo {
    private static final double SEGURO_FIXO = 30.0;

    public Carro(String placa, String modelo, double diaria) {
        super(placa, modelo, diaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        return super.calcularAluguel(dias) + SEGURO_FIXO;
    }
}