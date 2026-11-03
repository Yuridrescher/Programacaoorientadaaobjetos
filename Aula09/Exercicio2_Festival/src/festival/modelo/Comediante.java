package festival.modelo;

public class Comediante implements Apresentacao {
    private String nome;
    private String tema;
    private int duracao;

    public Comediante(String nome, String tema, int duracao) {
        this.nome = nome;
        this.tema = tema;
        this.duracao = duracao;
    }

    @Override
    public void apresentar() {
        System.out.println(nome + " esta fazendo comedia sobre: " + tema);
    }

    @Override
    public int getDuracaoMinutos() {
        return duracao;
    }
}
