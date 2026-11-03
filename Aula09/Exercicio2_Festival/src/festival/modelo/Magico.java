package festival.modelo;

public class Magico implements Apresentacao {
    private String nome;
    private int duracao;

    public Magico(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    @Override
    public void apresentar() {
        System.out.println(nome + " esta fazendo um truque de ilusionismo.");
    }

    @Override
    public int getDuracaoMinutos() {
        return duracao;
    }
}
