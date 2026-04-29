package academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public void SetIdade(int idade) {
        this.idade = idade;
    }
}
