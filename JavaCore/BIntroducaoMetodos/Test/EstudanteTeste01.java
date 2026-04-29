package academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Test;

import academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio.Estudante;
import academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Carlos";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Carol";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println("#########################");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
