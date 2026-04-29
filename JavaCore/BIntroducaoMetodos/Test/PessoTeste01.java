package academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Test;

import academy.devdojo.maratona.java.JavaCore.BIntroducaoMetodos.Dominio.Pessoa;

public class PessoTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // Método de imprimir
        pessoa.SetNome("Gabriel");
        pessoa.SetIdade(19);
        pessoa.imprime();

        // Método de retornar
        System.out.println(pessoa.GetNome());
        System.out.println(pessoa.GetIdade());
    }
}
