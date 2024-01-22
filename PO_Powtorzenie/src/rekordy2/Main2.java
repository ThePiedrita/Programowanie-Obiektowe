package rekordy2;

public class Main2 {
    public static void main(String[] args) {
        Person osoba = new Person("Bartek",
                "Kolega",
                new Address("Długa", 13, 200, "Płock")
        );
        System.out.println(osoba);
    }
}
