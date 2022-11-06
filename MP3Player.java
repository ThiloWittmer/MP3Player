import de.hsrm.mi.eibo.simpleplayer.SimpleAudioPlayer;
import de.hsrm.mi.eibo.simpleplayer.SimpleMinim;

/**
 * MP3Player
 */
public class MP3Player {

    private SimpleMinim minim;
    private SimpleAudioPlayer audioPlayer;
    
    public MP3Player() {
        minim = new SimpleMinim();
    }

    public void play(String fileName) {
        audioPlayer = minim.loadMP3File(fileName);
        audioPlayer.play();
    }

    public void play() {
        audioPlayer.play();
    }

    public void pause() {
        audioPlayer.pause();
    }

    public void volume(float value) {
        audioPlayer.setGain(value);
    }

    public void name() {
        //jhfbjhd
    }
}