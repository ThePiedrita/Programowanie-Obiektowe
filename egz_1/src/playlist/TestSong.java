package playlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestSong {
    public static void main(String[] args) {
        ArrayList<Song> piosenki = new ArrayList<>();
        piosenki.add(new Song("piosenka 1","boniek",160));
        piosenki.add(new Song("piosenka 2","zbigniew",25));
        piosenki.add(new Song("piosenka 4","tytus",160));
        piosenki.add(new Song("piosenka 3","tytus",160));
        piosenki.add(new Song("piosenka 5","artysta",1530));
        System.out.println(piosenki);
        System.out.println();

        piosenki.sort(new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println(piosenki);
    }
}
