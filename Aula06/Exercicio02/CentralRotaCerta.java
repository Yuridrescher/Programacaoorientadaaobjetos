package Aula06.Exercicio02;
import java.util.ArrayList;
import java.util.List;

public class CentralRotaCerta {
    private final List<Encomenda> pendentes = new ArrayList<>();

    public void cadastrarEncomenda(Encomenda encomenda) throws CodigoEncomendaDuplicadoException {
        for (Encomenda e : pendentes) {
            if (e.getCodigo().equalsIgnoreCase(encomenda.getCodigo())) {
                throw new CodigoEncomendaDuplicadoException("Código já cadastrado na central: " + encomenda.getCodigo());
            }
        }
        pendentes.add(encomenda);
    }

    public Encomenda realizarEntrega(String codigo) throws EncomendaNaoEncontradaException {
        for (int i = 0; i < pendentes.size(); i++) {
            Encomenda enc = pendentes.get(i);
            if (enc.getCodigo().equalsIgnoreCase(codigo)) {
                return pendentes.remove(i);
            }
        }
        throw new EncomendaNaoEncontradaException("Encomenda não encontrada para entrega: " + codigo);
    }

    public double getFreteTotalPendentes() {
        double total = 0.0;
        for (Encomenda e : pendentes) {
            total += e.calcularFrete();
        }
        return total;
    }

    public Encomenda getEncomendaMaisPesada() {
        if (pendentes.isEmpty()) return null;
        Encomenda maisPesada = pendentes.get(0);
        for (Encomenda e : pendentes) {
            if (e.getPesoKg() > maisPesada.getPesoKg()) {
                maisPesada = e;
            }
        }
        return maisPesada;
    }

    public int getQtdNormais() {
        int count = 0;
        for (Encomenda e : pendentes) {
            if (e instanceof EncomendaNormal) count++;
        }
        return count;
    }

    public int getQtdExpressas() {
        int count = 0;
        for (Encomenda e : pendentes) {
            if (e instanceof EncomendaExpressa) count++;
        }
        return count;
    }

    public int getQtdFragil() {
        int count = 0;
        for (Encomenda e : pendentes) {
            if (e instanceof EncomendaFragil) count++;
        }
        return count;
    }
}