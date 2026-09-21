package Aula05.Atividade02;

public class Principal {
    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();

        Funcionario f1 = new Funcionario("Carlos", 3000.0);
        Gerente g1 = new Gerente("Ana", 6000.0, 1500.0);
        Estagiario e1 = new Estagiario("Lucas", 2000.0, 20);

        folha.contratar(f1);
        folha.contratar(g1);
        folha.contratar(e1);

        System.out.println("Total da folha: R$ " + folha.fecharFolha());

        folha.aumentoGeral(10.0);

        System.out.println("Total da folha após aumento de 10%: R$ " + folha.fecharFolha());
    }
}