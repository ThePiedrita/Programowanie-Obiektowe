package zad5;

public class Osoba implements Comparable<Osoba>{
    String imie;
    int wzrost;
    int rokUrodzenia;

    public Osoba(String imie, int wzrost, int rokUrodzenia) {
        this.imie = imie;
        this.wzrost = wzrost;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public int compareTo(Osoba o) {
        return Integer.compare(o.wzrost,this.wzrost);
    }


    @Override
    public String toString() {
        return "{" +
                "imie='" + imie + '\'' +
                ", wzrost=" + wzrost +
                ", rokUrodzenia=" + rokUrodzenia +
                "}\n";
    }
}
