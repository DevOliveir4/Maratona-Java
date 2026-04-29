package academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Test;
import java.util.Scanner;
import academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio.Funcionario;
import academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio.ImpressoraFuncionario;

public class FuncionarioEx01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();

        ImpressoraFuncionario impressora = new ImpressoraFuncionario();

        System.out.println("---PRIMEIRO FUNCIONÁRIO---");
        System.out.println("Qual nome?");
        funcionario01.nome = leia.nextLine();
        System.out.println("Qual idade?");
        funcionario01.idade = leia.nextInt();
        funcionario01.salarios =  new double[3];
        for(int i = 0; i < funcionario01.salarios.length; i++) {
            System.out.printf("Qual o %dº salário? ", (i + 1));
            funcionario01.salarios[i] = leia.nextDouble();
        }

        leia.nextLine();

        System.out.println("---SEGUNDO FUNCIONÁRIO---");
        System.out.println("Qual nome?");
        funcionario02.nome = leia.nextLine();
        System.out.println("Qual idade?");
        funcionario02.idade = leia.nextInt();
        funcionario02.salarios =  new double[3];
        for(int i = 0; i < funcionario02.salarios.length; i++) {
            System.out.printf("Qual o %dº salário? ", (i + 1));
            funcionario02.salarios[i] = leia.nextDouble();
        }

        leia.nextLine();

        System.out.println("---TERCEIRO FUNCIONÁRIO---");
        System.out.println("Qual nome?");
        funcionario03.nome = leia.nextLine();
        System.out.println("Qual idade?");
        funcionario03.idade = leia.nextInt();
        funcionario03.salarios =  new double[3];
        for(int i = 0; i < funcionario03.salarios.length; i++) {
            System.out.printf("Qual o %dº salário? ", (i + 1));
            funcionario03.salarios[i] = leia.nextDouble();
        }

        System.out.println("------Exibindo-------");


        impressora.imprimeDados(funcionario01);
        impressora.imprimiSalario(funcionario01);

        impressora.imprimeDados(funcionario02);
        impressora.imprimiSalario(funcionario02);

        impressora.imprimeDados(funcionario03);
        impressora.imprimiSalario(funcionario02);
        
    }
}
