package zad7;

public class Main7 {
    public static void main(String[] args) {
        Integer[] tab={14,2,3,5,74};
        Person[] ludzie = {
                new Person("Stefan",20),
                new Person("Zbyszek",50),
                new Person("Tomek",15)
        };
        //System.out.println(minValue(ludzie));

    }
    public static <T extends Comparable<T>> T minValue(T[] tab){
        if(tab.length == 0)
            throw new IllegalArgumentException("Tablica nie moze byc pusta");
        T min = tab[0];
        for(T element : tab){
            if(element.compareTo(min)<0){
                min = element;
            }
        }
        return min;
    }
}
