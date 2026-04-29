package academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio;

public class ImpressoraFuncionario {
    public void imprimeDados(Funcionario funcionario) {
        System.out.println(funcionario.nome);
        System.out.println(funcionario.idade);

    }

    public void imprimiSalario(Funcionario funcionario) {
        if (funcionario.salarios != null) {
            int i = 0;
            double somaSalarios = 0;
            for (double salario: funcionario.salarios) {
                System.out.printf("Salário %d: R$%.2f%n", i, salario);
                somaSalarios += salario;
            }
            System.out.printf("A média dos salários é R$%.2f%n", (somaSalarios / funcionario.salarios.length));
        }

        System.out.println("---------------------");
    }
}
