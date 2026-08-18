package poo.semana03.atividade02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Consulta {
    Paciente paciente;
    LocalDate data;
    double valor;

    public Consulta(Paciente paciente, LocalDate data, double valor) {
        this.paciente = paciente;
        this.data = data;
        this.valor = valor;
    }

    public void remarcar(LocalDate novaData) {
        this.data = novaData;
    }

    public void exibirComprovante() {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(" COMPROVANTE DE CONSULTA ");
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Telefone: " + paciente.telefone);
        System.out.println("Data: " + data.format(formatoData));
        System.out.printf("Valor: R$ %.2f%n", valor);

    }
}
