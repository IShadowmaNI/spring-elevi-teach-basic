package spring.boot.b7.boot.music.mediaPlayers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.boot.b7.boot.music.media.Casette;
import spring.boot.b7.boot.music.media.Tape;

@Component
public class CasettePlayer implements TapePlayer {

    private Tape tape;

    @Autowired
    public CasettePlayer(Tape tape) {
        if(!(tape instanceof Casette)) {
            throw new IllegalArgumentException("Cannot use " + tape.getClass() + "this kind for this player");
        }

        this.tape = tape;
    }
    @Override
    public void rewindTape() {

        System.out.println("Rewind automatically");
    }

    @Override
    public void play() {

        System.out.println("Playing " + tape.showAlbumName());
    }

    @Override
    public void stop() {

        System.out.println("Stopping " + tape.showAlbumName());
    }
}
