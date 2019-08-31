package spring.boot.b7.boot.music.media;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Casette extends AbstractMedia implements Tape {


    public Casette(@Value("${casette.mediaName}") String mediaName,
                   @Value("${casette.artistName}") String artistName) {
        this.mediaName = mediaName;
        this.artistName = artistName;
    }
    public Casette() {}
    @Override
    public void rewindByHand() {
        System.out.println("rewinding..." + mediaName);
    }

    @Override
    public String showArtistName() {
        return null;
    }

    @Override
    public String showAlbumName() {
        return null;
    }

//    @Override
//    public String toString() {
//        return "Casette{" +
//                "mediaName='" + mediaName + '\'' +
//                ", artistName='" + artistName + '\'' +
//                '}';
//    }
}
