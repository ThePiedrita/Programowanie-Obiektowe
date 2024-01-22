package zad5;

import java.util.ArrayList;
import java.util.Collections;

public class MainOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> ludzie = new ArrayList<>();
        ludzie.add(new Osoba("Adam",160,1998));
        ludzie.add(new Osoba("Zbyszek",180,2000));
        ludzie.add(new Osoba("Rafał",175,2001));
        ludzie.add(new Osoba("Kamil",156,2007));
        ludzie.add(new Osoba("Tomek",185,1980));
        System.out.println(ludzie);
        Collections.sort(ludzie);
        System.out.println();
        System.out.println(ludzie);
    }
}
