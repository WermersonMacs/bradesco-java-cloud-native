package musicaPlayer; // define o pacote onde a classe esta localizada

// classe principal para executar o programa
public class MainApp {
    public static void main(String[] args) {
        // cria um objeto Computer e referencia como MusicaPlayer
        MusicaPlayer musicaPlayer = new Computer();
        // cria um objeto Computer e referencia como VideoPlayer
        VideoPlayer videoPlayer = new Computer();

        // executa metodo para rodar video
        runVideo(videoPlayer);
        // executa metodo para rodar musica
        runMusic(musicaPlayer);
    }

    // metodo que recebe uma interface VideoPlayer e executa playVideo
    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    // metodo que recebe uma interface MusicaPlayer e executa playMusic
    public static void runMusic(MusicaPlayer musicaPlayer){
        musicaPlayer.playMusic();
    }
}
