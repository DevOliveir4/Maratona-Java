package academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1,int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0) {
            return 0;
        }
        return num1/num2;
    }

    public double divideDoisNumeros02(double num1, double num2){
        if(num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimiDivideDoisNumeros(double num1, double num2){
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2) {

    }

    public void somaArrays(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVargs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}

