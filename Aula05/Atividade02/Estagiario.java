package Aula05.Atividade02;

public class Estagiario extends Funcionario {
    private int horasSemanais;

    public Estagiario(String nome, double salario, int horasSemanais) {
        super(nome, salario);
        this.horasSemanais = horasSemanais;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }

    @Override
    public double salarioDoMes() {
        return getSalario() * (horasSemanais / 40.0);
    }
}