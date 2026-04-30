package academy.devdojo.maratona.java.JavaCore.Fmodificadorestatico.test;

import academy.devdojo.maratona.java.JavaCore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 270);
        Carro c3 = new Carro("Audi", 275);
        c1.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }




}
