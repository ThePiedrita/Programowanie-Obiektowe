package rekordy3;

import java.util.List;

public record Order(List<Product>produkty) {
    public int totalValue(){
        int value = 0;
        for (Product produkt:produkty) {
            value+=produkt.cena();

        }
        return value;
    }
}
