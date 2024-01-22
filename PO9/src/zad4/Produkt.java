package zad4;

public class Produkt implements Comparable<Produkt>{
    String nazwa;
    double cena;
    int rokProdukcji;

    public Produkt(String nazwa, double cena, int rokProdukcji) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.rokProdukcji = rokProdukcji;
    }


    @Override
    public int compareTo(Produkt o) {
        return Integer.compare(this.rokProdukcji,o.rokProdukcji);
    }

    @Override
    public String toString() {
        return "{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", rokProdukcji=" + rokProdukcji +
                "}\n";
    }
}
