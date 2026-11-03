package escritorio.app;

import escritorio.modelo.*;

public class Principal {
    public static void main(String[] args) {
        Imprimivel imp = new ImpressoraBasica();
        Escaneavel scn = new ScannerMesa();
        Multifuncional multi = new Multifuncional();

        imp.imprimir("Relatorio.pdf");
        scn.escanear("Foto.png");
        
        multi.imprimir("Contrato.pdf");
        multi.escanear("Identidade.jpg");
        multi.enviarFax("Documentos.pdf");
    }
}
