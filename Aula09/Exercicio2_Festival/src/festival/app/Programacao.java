package festival.app;

import festival.modelo.Apresentacao;
import java.util.ArrayList;
import java.util.List;

public class Programacao {
    private List<Apresentacao> cronograma = new ArrayList<>();

    public void registrar(Apresentacao apresentacao) {
        cronograma.add(apresentacao);
    }

    public void iniciarFestival() {
        int tempoTotal = 0;
        for (Apresentacao a : cronograma) {
            a.apresentar();
            tempoTotal += a.getDuracaoMinutos();
        }
        System.out.println("Duracao total do festival: " + tempoTotal + " minutos.");
    }
}
