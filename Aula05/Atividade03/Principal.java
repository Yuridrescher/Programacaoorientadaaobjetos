package Aula05.Atividade03;

public class Principal {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();

        Carro carro1 = new Carro("ABC-1234", "Fiat Argo", 100.0);
        Moto moto1 = new Moto("XYZ-9876", "Honda CG", 50.0);

        locadora.cadastrarVeiculo(carro1);
        locadora.cadastrarVeiculo(moto1);

        locadora.alugar("ABC-1234", 3);
        locadora.alugar("XYZ-9876", 5);
        locadora.alugar("XYZ-9876", 10);

        locadora.alugar("ABC-1234", 0);
        locadora.alugar("JJJ-0000", 4);

        System.out.println("Faturamento total: R$ " + locadora.getFaturamento());
    }
}