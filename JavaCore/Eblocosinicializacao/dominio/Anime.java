package academy.devdojo.maratona.java.JavaCore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaco em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Contrutor é executado
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episodios: this.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
