package zad3;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(new Pracownik("Stefan",170.5,2000));
        pracownicy.add(new Pracownik("Marcin",190.2,2001));
        pracownicy.add(new Pracownik("Kamil",100,2013));
        pracownicy.add(new Pracownik("Bartek",200.4,2020));
        pracownicy.add(new Pracownik("Zbyszek",300,2019));
        System.out.println(pracownicy);
        Collections.sort(pracownicy);
        System.out.println(pracownicy);
    }
}
