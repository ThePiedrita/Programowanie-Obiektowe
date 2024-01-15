package zad2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Order implements Comparator<Order> {
    int id;
    String customerName;
    int orderDate;

    public Order(int id, String customerName, int orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    @Override
    public int compare(Order o1, Order o2) {
        if(Integer.compare(o1.orderDate,o2.orderDate)==0)
            return Integer.compare(o2.id,o1.id);
        return Integer.compare(o1.orderDate,o2.orderDate);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
