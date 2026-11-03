package escritorio.modelo;

public class Multifuncional implements Imprimivel, Escaneavel, EnviadorFax {
    @Override
    public void imprimir(String documento) {
        System.out.println("Multifuncional imprimindo: " + documento);
    }

    @Override
    public void escanear(String documento) {
        System.out.println("Multifuncional escaneando: " + documento);
    }

    @Override
    public void enviarFax(String documento) {
        System.out.println("Multifuncional enviando fax: " + documento);
    }
}
