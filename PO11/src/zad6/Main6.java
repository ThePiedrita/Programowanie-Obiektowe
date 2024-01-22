package zad6;

public class Main6 {
    public static void main(String[] args) {
        Counter<String> napisy = new Counter<>();
        System.out.println(napisy.getCount());
        napisy.add("napis1");
        System.out.println(napisy.getCount());
        Counter<Integer>liczby=new Counter<>();
        liczby.add(14);
        liczby.add(15);
        liczby.add(3);
        liczby.add(23);
        System.out.println(liczby.getCount());
    }

}
