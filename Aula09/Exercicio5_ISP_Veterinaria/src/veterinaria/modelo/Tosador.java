package veterinaria.modelo;

public class Tosador implements Banhista {
    @Override
    public void darBanho() { System.out.println("Dando banho..."); }
    @Override
    public void tosar() { System.out.println("Tosando pelo..."); }
}
