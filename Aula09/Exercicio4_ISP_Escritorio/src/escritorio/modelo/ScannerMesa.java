package escritorio.modelo;

public class ScannerMesa implements Escaneavel {
    @Override
    public void escanear(String documento) {
        System.out.println("Escaneando documento: " + documento);
    }
}
