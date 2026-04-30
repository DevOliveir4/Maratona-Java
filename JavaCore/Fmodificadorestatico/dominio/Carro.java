package academy.devdojo.maratona.java.JavaCore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velodicadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String nome, double velodicadeMaxima) {
        this.nome = nome;
        this.velodicadeMaxima = velodicadeMaxima;
    }

    public void imprime() {
        System.out.println("-------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade máxima " + this.velodicadeMaxima);
        System.out.println("Velocidade limite " + this.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelodicadeMaxima() {
        return velodicadeMaxima;
    }

    public void setVelodicadeMaxima(double velodicadeMaxima) {
        this.velodicadeMaxima = velodicadeMaxima;
    }
}
