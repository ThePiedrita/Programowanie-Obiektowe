package zad2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Napisz klasę Order z polami id (typu int), customerName (typu String) oraz orderDate (typu LocalDate).
//Zaimplementuj generyczny interfejs Comparator do porównywania obiektów po polu orderDate
//(od najwcześniejszej do najpóźniejszej daty), a w przypadku równości po polu id.
//Stwórz listę 5 obiektów klasy Order i posortuj ją zgodnie z opisanym kryterium.
public class Main {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(13,"Karol",2024));
        orders.add(new Order(10,"Marcin",2024));
        orders.add(new Order(15,"Adnrzej",2000));
        orders.add(new Order(51,"Zbyszek",1469));
        orders.add(new Order(3,"Bartek",1865));
        System.out.println(orders);
        Collections.sort(orders,new OrderDateComparator());
        System.out.println(orders);



    }
}
