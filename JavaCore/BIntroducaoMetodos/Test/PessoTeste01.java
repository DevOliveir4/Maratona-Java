package academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Test;

import academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio.Pessoa;

public class PessoTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.SetNome("Gabriel");
        pessoa.SetIdade(19);

        pessoa.imprime();
    }
}
