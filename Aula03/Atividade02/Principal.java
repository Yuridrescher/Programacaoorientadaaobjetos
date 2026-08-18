package poo.semana03.atividade02;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Mariana Alves", "(51) 99999-1111");
        Paciente paciente2 = new Paciente("João Pereira", "(51) 99999-2222");

        Consulta consulta1 = new Consulta(paciente1, LocalDate.of(2026, 8, 20), 180.00);
        Consulta consulta2 = new Consulta(paciente2, LocalDate.of(2026, 8, 22), 220.00);

        consulta2.remarcar(LocalDate.of(2026, 8, 25));

        consulta1.exibirComprovante();
        consulta2.exibirComprovante();
    }
}
