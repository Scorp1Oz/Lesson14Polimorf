import Models.*;
import Service.*;
public class Project {
    public static void main(String[] args) {
        MusicPlayer popBand = new PopMusic();
        MusicPlayer rockBand = new RockMusic();
        MusicPlayer classicBand = new ClassicMusic();

        MusicPlayer[] musicBands = {popBand, rockBand, classicBand};

        String[] bandNames = {"Pop Band", "Rock Band", "Classic Band"};

        for (int i = 0; i < musicBands.length; i++) {
            System.out.print(bandNames[i] + ": ");
            musicBands[i].playMusic();
        }
    }
}
