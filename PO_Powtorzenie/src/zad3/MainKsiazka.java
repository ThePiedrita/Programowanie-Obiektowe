package zad3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainKsiazka {
    public static void main(String[] args){
        ArrayList<Ksiazka>k = new ArrayList<>();
        k.add(new Ksiazka("nazwa",13,4234));
        k.add(new Ksiazka("nazwa2",12,1434));
        k.add(new Ksiazka("nazwa3",41,2034));
        System.out.println(k);
        System.out.println();
        Collections.sort(k,new DateComparator());
        System.out.println(k);




    }
}
