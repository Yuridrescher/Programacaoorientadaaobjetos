package frotalog.app;

import frotalog.modelo.*;
import frotalog.servico.Despacho;

public class Principal {
    public static void main(String[] args) {
        Despacho despacho = new Despacho();
        despacho.adicionarVeiculo(new Caminhao("CAM-111", 5000));
        despacho.adicionarVeiculo(new Van("VAN-222"));
        despacho.adicionarVeiculo(new Moto("MOT-333"));
        despacho.adicionarVeiculo(new Bicicleta("BIC-444"));

        System.out.println("--- ROTA DE 3 KM ---");
        despacho.processarEntregas(3.0);
        
        System.out.println("\n--- ROTA DE 80 KM ---");
        despacho.processarEntregas(80.0);
    }
}
