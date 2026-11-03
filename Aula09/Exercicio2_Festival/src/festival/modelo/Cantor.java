package festival.modelo;

public class Cantor implements Apresentacao {
    private String nome;
    private String musica;
    private int duracao;

    public Cantor(String nome, String musica, int duracao) {
        this.nome = nome;
        this.musica = musica;
        this.duracao = duracao;
    }

    @Override
    public void apresentar() {
        System.out.println(nome + " esta cantando a musica: " + musica);
    }

    @Override
    public int getDuracaoMinutos() {
        return duracao;
    }
}
