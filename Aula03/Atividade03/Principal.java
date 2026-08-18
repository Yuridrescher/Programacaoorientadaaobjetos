package poo.semana03.atividade03;

public class Principal {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis", "Brasileira");
        Autor autor2 = new Autor("George Orwell", "Britânica");

        Livro livro1 = new Livro("Dom Casmurro", autor1, 1899);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", autor1, 1881);
        Livro livro3 = new Livro("1984", autor2, 1949);

        livro1.emprestar();
        livro1.emprestar();
        livro1.devolver();
        livro1.devolver();

        livro1.exibirFicha();
        livro2.exibirFicha();
        livro3.exibirFicha();
    }
}
