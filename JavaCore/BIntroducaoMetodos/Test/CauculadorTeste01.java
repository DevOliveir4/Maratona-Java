package academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Test;

import academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio.Calculadora;

public class CauculadorTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();


        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();

        System.out.println("Finalizando calculadora teste 01");
    }
}
