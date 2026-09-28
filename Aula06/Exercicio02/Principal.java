package Aula06.Exercicio02;
public class Principal {
    public static void main(String[] args) {
        CentralRotaCerta central = new CentralRotaCerta();

        try {
            central.cadastrarEncomenda(new EncomendaNormal("RC-101", new Destinatario("Mariana"), 12.0));
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "]: " + e.getMessage());
        }

        try {
            central.cadastrarEncomenda(new EncomendaExpressa("RC-202", new Destinatario("Thiago"), 4.0));
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "]: " + e.getMessage());
        }

        try {
            central.cadastrarEncomenda(new EncomendaFragil("RC-303", new Destinatario("Larissa"), 6.5));
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "]: " + e.getMessage());
        }

        try {
            central.cadastrarEncomenda(new EncomendaExpressa("RC-404", new Destinatario("Carlos"), 14.5));
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "]: " + e.getMessage());
        }

        try {
            central.cadastrarEncomenda(new EncomendaNormal("RC-101", new Destinatario("Renata"), 3.0));
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "]: " + e.getMessage());
        }

        try {
            central.cadastrarEncomenda(new EncomendaNormal("RC-505", new Destinatario("Felipe"), -2.0));
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "]: " + e.getMessage());
        }

        try {
            central.realizarEntrega("RC-202");
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "]: " + e.getMessage());
        }

        try {
            central.realizarEntrega("CODIGO-INEXISTENTE");
        } catch (Exception e) {
            System.out.println("[" + e.getClass().getSimpleName() + "]: " + e.getMessage());
        }

        System.out.println("\n===== RELATÓRIO DA CENTRAL (PENDENTES) =====");
        System.out.printf("Frete total das pendentes: R$ %.2f%n", central.getFreteTotalPendentes());

        Encomenda pesada = central.getEncomendaMaisPesada();
        if (pesada != null) {
            System.out.printf("Mais pesada: %s (%s) com %.2f kg%n", pesada.getCodigo(), pesada.getDestinatario().getNome(), pesada.getPesoKg());
        }

        System.out.println("Quantidade por tipo:");
        System.out.println(" - Normal: " + central.getQtdNormais());
        System.out.println(" - Expressa: " + central.getQtdExpressas());
        System.out.println(" - Frágil: " + central.getQtdFragil());
    }
}