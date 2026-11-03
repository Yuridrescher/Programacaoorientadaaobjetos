package veterinaria.modelo;

public class Recepcionista implements Atendente {
    @Override
    public void agendarConsulta() { System.out.println("Consulta agendada."); }
    @Override
    public void emitirRecibo() { System.out.println("Recibo emitido."); }
}
