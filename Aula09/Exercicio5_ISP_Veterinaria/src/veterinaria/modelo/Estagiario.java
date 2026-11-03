package veterinaria.modelo;

public class Estagiario implements Atendente, Banhista {
    @Override
    public void agendarConsulta() { System.out.println("Estagiario agendando..."); }
    @Override
    public void emitirRecibo() { System.out.println("Estagiario emitindo recibo..."); }
    @Override
    public void darBanho() { System.out.println("Estagiario dando banho..."); }
    @Override
    public void tosar() { System.out.println("Estagiario tentando tosar..."); }
}
