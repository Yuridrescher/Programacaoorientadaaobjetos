package Aula05.Atividade03;

public class Moto extends Veiculo {

    public Moto(String placa, String modelo, double diaria) {
        super(placa, modelo, diaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        double valorBase = super.calcularAluguel(dias);
        if (dias >= 7) {
            return valorBase * 0.90;
        }
        return valorBase;
    }
}