package academy.devdojo.maratona.java.JavaCore.AIntroducaoClasses.test;

import academy.devdojo.maratona.java.JavaCore.AIntroducaoClasses.dominio.Carro;

public class CarrroTest01 {
    static void main(String[] args) {
        Carro carro01 = new Carro();

        carro01.marca = "Toyota";
        carro01.modelo = "Corola Cross";
        carro01.ano = 2025;

        Carro carro02 = new Carro();

        carro02.marca = "Ford";
        carro02.modelo = "Focus";
        carro02.ano = 2018;

        System.out.println("O carro 01 tem as seguintes caracteristicas, marca: " + carro01.marca + ", modelo: " + carro01.modelo + ", ano: " + carro01.ano);

        System.out.println("-----------------");

        System.out.println("O carro 02 tem as seguintes caracteristicas, marca: " + carro02.marca + ", modelo: " + carro02.modelo + ", ano: " + carro02.ano);


    }
}
