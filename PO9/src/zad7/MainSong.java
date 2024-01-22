package zad7;

import java.util.ArrayList;
import java.util.Collections;

public class MainSong {
    public static void main(String[] args) {
        ArrayList<Song> piosenki = new ArrayList<>();
        piosenki.add(new Song("piosenka 1","artysta 1",130));
        piosenki.add(new Song("piosenka 3","artysta 1",130));
        piosenki.add(new Song("piosenka 4","artysta 2",130));
        piosenki.add(new Song("piosenka 5","artysta 3",90));
        piosenki.add(new Song("piosenka 6","artysta 4",100));
        System.out.println(piosenki);
        Collections.sort(piosenki,new DurationComparator());
        Collections.sort(piosenki,new ArtistTitleComparator());
        System.out.println();
        System.out.println(piosenki);
    }
}
