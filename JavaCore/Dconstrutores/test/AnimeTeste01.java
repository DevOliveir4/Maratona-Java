package academy.devdojo.maratona.java.JavaCore.Dconstrutores.test;

import academy.devdojo.maratona.java.JavaCore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime("Naruto", "TV", 40, "Ação");
        Anime anime02 = new Anime();
        anime01.imprime();
        anime02.imprime();
    }
}
