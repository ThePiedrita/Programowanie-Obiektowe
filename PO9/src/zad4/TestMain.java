package zad4;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<Produkt>produkty = new ArrayList<>();
        produkty.add(new Produkt("Kamien",13.5,2003));
        produkty.add(new Produkt("Gitara",150.64,2020));
        produkty.add(new Produkt("Perkusja",59,2019));
        produkty.add(new Produkt("Garnek",20,2024));
        produkty.add(new Produkt("Patelnia",35.34,2000));
        System.out.println(produkty);
        Collections.sort(produkty);
        System.out.println();
        System.out.println(produkty);

    }
}
