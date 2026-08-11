public class Principal {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.titulo = "A Origem";
        f1.duracao = 148;
        f1.nota = 8.5;
        f1.assistido = false;

        Filme f2 = new Filme();
        f2.titulo = "Matrix";
        f2.duracao = 136;
        f2.nota = 8.7;
        f2.assistido = false;

        Filme f3 = new Filme();
        f3.titulo = "O Senhor dos Anéis";
        f3.duracao = 201;
        f3.nota = 9.0;
        f3.assistido = false;

        f1.marcarAssistido();
        f2.avaliar(9.5);

        f1.exibirFicha();
        f2.exibirFicha();
        f3.exibirFicha();
