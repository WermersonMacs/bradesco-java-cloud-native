package musicaPlayer; // define o pacote onde a classe esta localizada

// classe MusicBox que implementa a interface MusicaPlayer
public class MusicBox implements MusicaPlayer {

    // metodo para tocar musica
    @Override
    public void playMusic() {
        System.out.println("Tocando musica do MidiaBox!");
    }

    // metodo para pausar a musica
    @Override
    public void pauseMusic() {
        System.out.println("Pausando musica do MidiaBox!");
    }

    // metodo para parar a musica
    @Override
    public void stopMusic() {
        System.out.println("Parando musica do MidiaBox!");
    }
}
