package rekordy1;

public class Main1 {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO("ksiazka1","autor1",15.3,2000);
        BookDTO book2 = new BookDTO("ksiazka2","autor2",16.5,2013);
        System.out.println(book1);
        System.out.println(book2);
    }
}
