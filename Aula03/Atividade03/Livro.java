package poo.semana03.atividade03;

public class Livro {
    String titulo;
    Autor autor;
    int ano;
    boolean emprestado;

    public Livro(String titulo, Autor autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }

    public void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.nome);
        System.out.println("Ano: " + ano);
        System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
    }

    public void emprestar() {
        if (emprestado) {
            System.out.println("O livro '" + titulo + "' já está emprestado.");
            return;
        }

        emprestado = true;
        System.out.println("Empréstimo do livro '" + titulo + "' realizado.");
    }

    public void devolver() {
        if (!emprestado) {
            System.out.println("O livro '" + titulo + "' não está emprestado.");
            return;
        }

        emprestado = false;
        System.out.println("Devolução do livro '" + titulo + "' realizada.");
    }
}
