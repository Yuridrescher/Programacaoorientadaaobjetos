package ContaBancaria05;

public class Titular {
    private String nome;
    private String cpf;
    private String dataNasc;

    public Titular(String nome, String cpf, String data) {
        setNome(nome);
        this.cpf = cpf;
        this.dataNasc = data;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido: não pode ser vazio.");
            return;
        }
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDataNasc() {
        return this.dataNasc;
    }
}
