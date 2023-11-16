package Models;
import Service.*;

public class MusicStyles implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("Playing generic music");
    }
}