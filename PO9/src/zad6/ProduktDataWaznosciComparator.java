package zad6;

import java.util.Comparator;

public class ProduktDataWaznosciComparator implements Comparator<Produkt> {
    @Override
    public int compare(Produkt o1, Produkt o2) {
        return Integer.compare(o1.dataWaznosci, o2.dataWaznosci);
    }
}
