package spring.boot.b7.boot.music.media;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Casette extends AbstractMedia implements Tape {

    public Casette(@Value("${casette.mediaName}") String mediaName,
                   @Value("Barosani") String artistName) {
        this.mediaName = mediaName;
        this.artistName = artistName;
    }


    @Override
    public void rewindByHand() {
        System.out.println("rewinding..." + mediaName);
    }

    @Override
    public String showArtistName() {
        return mediaName;
    }

    @Override
    public String showAlbumName() {
        return artistName;
    }

//    @Override
//    public String toString() {
//        return "Casette{" +
//                "mediaName='" + mediaName + '\'' +
//                ", artistName='" + artistName + '\'' +
//                '}';
//    }
}
