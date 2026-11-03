package escritorio.modelo;

public class ImpressoraBasica implements Imprimivel {
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimindo documento: " + documento);
    }
}
