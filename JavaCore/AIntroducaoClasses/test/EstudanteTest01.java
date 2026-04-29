package academy.devdojo.maratona.java.JavaCore.AIntroducaoClasses.test;

import academy.devdojo.maratona.java.JavaCore.AIntroducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Gabriel";
        estudante.idade = 19;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println(estudante);

    }
}
