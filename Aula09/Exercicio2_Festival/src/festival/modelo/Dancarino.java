package festival.modelo;

public class Dancarino implements Apresentacao {
    private String nome;
    private String estilo;
    private int duracao;

    public Dancarino(String nome, String estilo, int duracao) {
        this.nome = nome;
        this.estilo = estilo;
        this.duracao = duracao;
    }

    @Override
    public void apresentar() {
        System.out.println(nome + " esta dancando no estilo: " + estilo);
    }

    @Override
    public int getDuracaoMinutos() {
        return duracao;
    }
}
