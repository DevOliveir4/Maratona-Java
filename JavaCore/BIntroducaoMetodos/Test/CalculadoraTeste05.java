package academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Test;

import academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] nums = {1,2,3,10};
        calculadora.somaArrays(nums);
        calculadora.somaVargs(1,2,3,10);
    }


}
