package zad2;
//Napisz klasę Course, która zawiera pola: name (typu String), numberOfHours (typu int) i price (typu double). Zaimplementuj interfejs Comparable w taki sposób, aby obiekty klasy Course były sortowane według jednego kryterium: rosnąco według liczby godzin, a przy równości sortowane były malejąco według ceny. Stwórz tablicę 4 obiektów klasy Course i posortuj ją według sprecyzowanego kryterium.

public class Course implements Comparable<Course>{
    public String name;
    public int numberOfHours;
    double price;

    public Course(String name, int numberOfHours, double price) {
        this.name = name;
        this.numberOfHours = numberOfHours;
        this.price = price;
    }

    @Override
    public int compareTo(Course o) {
        if(Integer.compare(this.numberOfHours,o.numberOfHours)==0){
            return Double.compare(o.price,this.price);
        }
        return Integer.compare(this.numberOfHours,o.numberOfHours);
    }

}
