package zad7;

import java.util.Comparator;

public class Song implements Comparator<Song> {
    String title;
    String artist;
    int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                "}\n";
    }

    @Override
    public int compare(Song o1, Song o2) {
        if(Integer.compare(o1.duration,o2.duration)==0){
            if(o1.artist.compareTo(o2.artist)==0){
                return o1.title.compareTo(o2.title);
            }
            else
                return o1.artist.compareTo(o2.artist);
        }
        return Integer.compare(o1.duration,o2.duration);

    }
}
