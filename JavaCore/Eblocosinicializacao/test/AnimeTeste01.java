package academy.devdojo.maratona.java.JavaCore.Eblocosinicializacao.test;

import academy.devdojo.maratona.java.JavaCore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("One piece");

        for(int episodios: anime01.getEpisodios()) {
            System.out.print(episodios + " ");
        }
        System.out.println();

        System.out.println(anime01.getEpisodios());
    }
}
