package academy.devdojo.maratona.java.JavaCore.AIntroducaoClasses.test;

import academy.devdojo.maratona.java.JavaCore.AIntroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre dojo";
        professor.idade = 49;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " Idade: " +  professor.idade + " Sexo: " +  professor.sexo);


    }
}
