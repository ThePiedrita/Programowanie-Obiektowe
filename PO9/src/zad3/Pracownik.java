package zad3;

public class Pracownik implements Comparable<Pracownik>{
    String imie;
    double pensja;
    int dataZatrudnienia;

    public Pracownik(String imie, double pensja, int dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public int compareTo(Pracownik o) {
        return Double.compare(this.pensja,o.pensja);
    }

    @Override
    public String toString() {
        return "{" +
                "imie='" + imie +
                ", pensja=" + pensja +
                ", dataZatrudnienia=" + dataZatrudnienia +
                "}\n";
    }
}
