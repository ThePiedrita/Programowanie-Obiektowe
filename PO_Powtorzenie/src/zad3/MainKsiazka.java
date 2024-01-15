package zad3;

import java.util.ArrayList;
import java.util.Collection;

public class MainKsiazka {
    public static void main(String[] args){
        ArrayList<Ksiazka>k = new ArrayList<>();
        k.add(new Ksiazka("nazwa",13,1134));
        k.add(new Ksiazka("nazwa2",12,1434));
        k.add(new Ksiazka("nazwa3",41,2034));
        System.out.println(k);
        System.out.println();


    }
}
