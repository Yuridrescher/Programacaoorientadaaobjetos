package Aula05.Atividade02;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aplicarAumento(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100.0);
        }
    }

    public double salarioDoMes() {
        return salario;
    }
}