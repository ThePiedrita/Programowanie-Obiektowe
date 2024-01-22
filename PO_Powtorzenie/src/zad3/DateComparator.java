package zad3;

import java.util.Comparator;

public class DateComparator implements Comparator<Ksiazka> {
    @Override
    public int compare(Ksiazka o1, Ksiazka o2) {
        return Integer.compare(o1.rokWydania,o2.rokWydania);
    }
}
