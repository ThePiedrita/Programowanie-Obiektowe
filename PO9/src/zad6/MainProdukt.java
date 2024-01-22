package zad6;

import java.util.ArrayList;
import java.util.Collections;

public class MainProdukt {
    public static void main(String[] args) {
        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(new Produkt("produkt 1",14,1997));
        produkty.add(new Produkt("produkt 2",20,2000));
        produkty.add(new Produkt("produkt 3",70,2004));
        produkty.add(new Produkt("produkt 4",85,2006));
        produkty.add(new Produkt("produkt 5",39,2010));
        System.out.println(produkty);
        Collections.sort(produkty,new ProduktDataWaznosciComparator());
        System.out.println();
        System.out.println(produkty);
    }
}
