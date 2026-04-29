package academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Test;

import academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resut = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resut);
        System.out.println(calculadora.divideDoisNumeros02(20,0));
        calculadora.imprimiDivideDoisNumeros(20,0);

    }
}
