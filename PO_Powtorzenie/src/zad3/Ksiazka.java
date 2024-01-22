package zad3;

import java.util.Comparator;
import java.util.Date;

public class Ksiazka implements Comparator<Ksiazka> {
    String tytul;
    double cena;
    int rokWydania;

    public Ksiazka(String tytul, double cena, int rokWydania) {
        this.tytul = tytul;
        this.cena = cena;
        this.rokWydania = rokWydania;
    }

    @Override
    public int compare(Ksiazka o1, Ksiazka o2) {
        return Integer.compare(o1.rokWydania,o2.rokWydania);
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", cena=" + cena +
                ", rokWydania=" + rokWydania +
                '}';
    }
}
