import java.util.ArrayList;
import java.util.List;

public class Academia {
    private final List<Matricula> matriculas = new ArrayList<>();
    private final int[] checkInsPorDia = new int[7];

    public void adicionarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }

    public void registrarCheckIn(int diaSemana) {
        if (diaSemana < 0 || diaSemana > 6) {
            throw new IllegalArgumentException("Dia inválido: " + diaSemana + ". O valor deve estar entre 0 (Domingo) e 6 (Sábado).");
        }
        checkInsPorDia[diaSemana]++;
    }

    public double getReceitaMensalTotal() {
        double total = 0.0;
        for (Matricula m : matriculas) {
            total += m.calcularMensalidade();
        }
        return total;
    }

    public Matricula getMatriculaMaisCara() {
        if (matriculas.isEmpty()) return null;
        Matricula maisCara = matriculas.get(0);
        for (Matricula m : matriculas) {
            if (m.calcularMensalidade() > maisCara.calcularMensalidade()) {
                maisCara = m;
            }
        }
        return maisCara;
    }

    public int getDiaMaisMovimentado() {
        int diaMaisMovimentado = 0;
        int maximo = checkInsPorDia[0];
        for (int i = 1; i < checkInsPorDia.length; i++) {
            if (checkInsPorDia[i] > maximo) {
                maximo = checkInsPorDia[i];
                diaMaisMovimentado = i;
            }
        }
        return diaMaisMovimentado;
    }

    public int getCheckInsDoDia(int dia) {
        return checkInsPorDia[dia];
    }
}