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
        if(idade < 0) {
            System.out.println("Idade Inválidada");
            return;
        }
        this.idade = idade;
    }

    public String GetNome() {
        return this.nome;
    }

    public int GetIdade() {
        return this.idade;
    }
}
