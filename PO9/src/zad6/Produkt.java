package zad6;

import java.util.Comparator;

public class Produkt implements Comparator<Produkt> {
    String nazwa;
    double cena;
    int dataWaznosci;

    public Produkt(String nazwa, double cena, int dataWaznosci) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dataWaznosci = dataWaznosci;
    }

    @Override
    public int compare(Produkt o1, Produkt o2) {
        return Integer.compare(o1.dataWaznosci,o2.dataWaznosci);
    }

    @Override
    public String toString() {
        return "{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", dataWaznosci=" + dataWaznosci +
                "}\n";
    }
}
