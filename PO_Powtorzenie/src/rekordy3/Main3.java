package rekordy3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("gitara",132));
        products.add(new Product("wywrotka",22));
        products.add(new Product("laptop",2003));
        products.add(new Product("koc",26));
        Order order = new Order(products);
        System.out.println(order.totalValue());
    }
}
