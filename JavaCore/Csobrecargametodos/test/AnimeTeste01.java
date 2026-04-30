package academy.devdojo.maratona.java.JavaCore.Csobrecargametodos.test;

import academy.devdojo.maratona.java.JavaCore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto", "TV", 40, "Ação");

        anime.imprime();
    }
}
