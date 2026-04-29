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
        funcionario01.setNome(leia.nextLine());
        System.out.println("Qual idade?");
        funcionario01.setIdade(leia.nextInt());
        double[] salarios1 = new double[3];

        for(int i = 0; i < salarios1.length; i++) {
            System.out.printf("Qual o %dº salário? ", (i + 1));
            salarios1[i] = leia.nextDouble();
        }
        funcionario01.setSalarios(salarios1);

        leia.nextLine();

        System.out.println("---SEGUNDO FUNCIONÁRIO---");
        System.out.println("Qual nome?");
        funcionario02.setNome(leia.nextLine());
        System.out.println("Qual idade?");
        funcionario02.setIdade(leia.nextInt());
        double[] salarios2 = new double[3];

        for(int i = 0; i < salarios2.length; i++) {
            System.out.printf("Qual o %dº salário? ", (i + 1));
            salarios2[i] = leia.nextDouble();
        }
        funcionario02.setSalarios(salarios2);

        leia.nextLine();

        System.out.println("---TERCEIRO FUNCIONÁRIO---");
        System.out.println("Qual nome?");
        funcionario03.setNome(leia.nextLine());
        System.out.println("Qual idade?");
        funcionario03.setIdade(leia.nextInt());
        double[] salarios3 = new double[3];

        for(int i = 0; i < salarios3.length; i++) {
            System.out.printf("Qual o %dº salário? ", (i + 1));
            salarios3[i] = leia.nextDouble();
        }
        funcionario03.setSalarios(salarios3);

        leia.nextLine();


        System.out.println("------Exibindo-------");


        impressora.imprimeDados(funcionario01);
        impressora.imprimiSalario(funcionario01);

        impressora.imprimeDados(funcionario02);
        impressora.imprimiSalario(funcionario02);

        impressora.imprimeDados(funcionario03);
        impressora.imprimiSalario(funcionario02);
        
    }
}
