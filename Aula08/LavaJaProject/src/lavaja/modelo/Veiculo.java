package lavaja.modelo;

public class Veiculo {
    private String placa;
    private String modelo;
    private Porte porte;
    private Cliente cliente;

    public Veiculo(String placa, String modelo, Porte porte, Cliente cliente) {
        this.placa = placa;
        this.modelo = modelo;
        this.porte = porte;
        this.cliente = cliente;
    }

    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public Porte getPorte() { return porte; }
    public Cliente getCliente() { return cliente; }
}
