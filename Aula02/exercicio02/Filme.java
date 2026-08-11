public class Filme {
    String titulo;
    int duracao;
    double nota;
    boolean assistido;

    public void exibirFicha() {
        System.out.println("Filme: " + titulo);
        System.out.println("Duração: " + duracao);
        System.out.println("Nota: " + nota);
        System.out.println("Assistido: " + assistido);
        System.out.println("----");
    }

    public void marcarAssistido() {
        assistido = true;
    }

    public void avaliar(double novaNota) {
        if (novaNota >= 0 && novaNota <= 10) {
            nota = novaNota;
        }
    }
}
