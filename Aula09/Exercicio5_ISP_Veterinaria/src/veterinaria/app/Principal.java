package veterinaria.app;

import veterinaria.modelo.*;

public class Principal {
    public static void main(String[] args) {
        Veterinario vet = new Veterinario();
        vet.consultar();
        
        Tosador tosador = new Tosador();
        tosador.darBanho();
        
        Recepcionista rec = new Recepcionista();
        rec.emitirRecibo();
        
        Estagiario estagiario = new Estagiario();
        estagiario.agendarConsulta();
        estagiario.darBanho();
    }
}
