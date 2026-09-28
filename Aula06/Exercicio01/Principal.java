public class Principal {
    public static void main(String[] args) {
        Academia academia = new Academia();
        String[] diasDaSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

        try {
            academia.adicionarMatricula(new PlanoMensal(new Aluno("Lucas"), 100.0));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            academia.adicionarMatricula(new PlanoAnual(new Aluno("Beatriz"), 120.0));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            academia.adicionarMatricula(new PlanoFamilia(new Aluno("Carlos"), 100.0, 3));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            academia.adicionarMatricula(new PlanoMensal(new Aluno("Marcos"), 60.0));
        } catch (Exception e) {
            System.out.println("Erro capturado na matrícula: " + e.getMessage());
        }

        try {
            academia.adicionarMatricula(new PlanoFamilia(new Aluno("Fernanda"), 100.0, 7));
        } catch (Exception e) {
            System.out.println("Erro capturado na matrícula: " + e.getMessage());
        }

        int[] simulacaoCheckIns = {1, 1, 2, 2, 2, 3, 4, 7, -2, 5};
        for (int dia : simulacaoCheckIns) {
            try {
                academia.registrarCheckIn(dia);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro capturado no check-in: " + e.getMessage());
            }
        }

        System.out.println("\n--- RELATÓRIO DO FIM DO MÊS ---");
        System.out.printf("Receita mensal total: R$ %.2f%n", academia.getReceitaMensalTotal());

        Matricula maisCara = academia.getMatriculaMaisCara();
        if (maisCara != null) {
            System.out.printf("Matrícula mais cara: %s (R$ %.2f)%n", maisCara.getAluno().getNome(), maisCara.calcularMensalidade());
        }

        int diaPico = academia.getDiaMaisMovimentado();
        System.out.printf("Dia mais movimentado: %s (%d entradas)%n", diasDaSemana[diaPico], academia.getCheckInsDoDia(diaPico));
    }
}