package zad2;

import java.util.Comparator;

public class OrderIdComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return Integer.compare(o2.id,o1.id);
    }
}
