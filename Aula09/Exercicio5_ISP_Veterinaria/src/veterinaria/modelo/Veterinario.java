package veterinaria.modelo;

public class Veterinario implements Medico {
    @Override
    public void consultar() { System.out.println("Consultando animal..."); }
    @Override
    public void vacinar() { System.out.println("Vacinando animal..."); }
    @Override
    public void operar() { System.out.println("Operando animal..."); }
}
