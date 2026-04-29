package academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio;

public class ImpressoraFuncionario {
    public void imprimeDados(Funcionario funcionario) {
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getIdade());

    }

    public void imprimiSalario(Funcionario funcionario) {
        if (funcionario.getSalarios() != null) {
            int i = 0;
            double somaSalarios = 0;
            for (double salario: funcionario.getSalarios()) {
                System.out.printf("Salário %d: R$%.2f%n", i, salario);
                somaSalarios += salario;
            }
            System.out.printf("A média dos salários é R$%.2f%n", (somaSalarios / funcionario.getSalarios().length));
        }

        System.out.println("---------------------");
    }
}
