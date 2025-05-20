package musicaPlayer; // define o pacote onde a classe esta localizada

// classe Computer que implementa as interfaces VideoPlayer e MusicaPlayer
public class Computer implements VideoPlayer, MusicaPlayer{

    // metodo para tocar musica
    @Override
    public void playMusic() {
        System.out.println("Tocando musica do Computer!");
    }

    // metodo para pausar a musica
    @Override
    public void pauseMusic() {
        System.out.println("Pausando musica do Computer!");
    }

    // metodo para parar a musica
    @Override
    public void stopMusic() {
        System.out.println("Parando musica do Computer!");
    }

    // metodo para tocar video
    @Override
    public void playVideo() {
        System.out.println("Tocando Video do Computer!");
    }

    // metodo para pausar o video
    @Override
    public void pauseVideo() {
        System.out.println("Pausando Video do Computer!");
    }

    // metodo para parar o video
    @Override
    public void stopVideo() {
        System.out.println("Parando Video do Computer!");
    }
}
