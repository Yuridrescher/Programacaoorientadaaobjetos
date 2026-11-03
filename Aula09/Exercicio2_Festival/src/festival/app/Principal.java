package festival.app;

import festival.modelo.*;

public class Principal {
    public static void main(String[] args) {
        Programacao programacao = new Programacao();
        
        programacao.registrar(new Cantor("Joao", "Evidencias", 5));
        programacao.registrar(new Dancarino("Maria", "Tango", 8));
        programacao.registrar(new Comediante("Carlos", "Vida de Dev", 10));
        programacao.registrar(new Magico("Houdini", 15));

        programacao.iniciarFestival();
    }
}
