package musicaPlayer; // define o pacote onde a classe esta localizada

// classe Smartphone que implementa as interfaces VideoPlayer e MusicaPlayer
public class Smartphone implements VideoPlayer, MusicaPlayer {

    // metodo para tocar musica
    @Override
    public void playMusic() {
        System.out.println("Tocando musica do Smarthphone!");
    }

    // metodo para pausar musica
    @Override
    public void pauseMusic() {
        System.out.println("Pausando musica do Smarthphone!");
    }

    // metodo para parar musica
    @Override
    public void stopMusic() {
        System.out.println("Parando musica do Smarthphone!");
    }

    // metodo para tocar video
    @Override
    public void playVideo() {
        System.out.println("Tocando Video do Smarthphone!");
    }

    // metodo para pausar video
    @Override
    public void pauseVideo() {
        System.out.println("Pausando Video do Smarthphone!");
    }

    // metodo para parar video
    @Override
    public void stopVideo() {
        System.out.println("Parando Video do Smarthphone!");
    }
}
