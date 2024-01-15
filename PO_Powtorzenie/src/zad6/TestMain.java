package zad6;

public class TestMain {
    public static void main(String[] args) {
        Discord discord = new Discord();
        Email email = new Email();
        Użytkownik u1 = new Użytkownik(discord);
        Użytkownik u2 = new Użytkownik(email);
        u1.powiadomOModernizacji("Informacja 1");
        u2.powiadomOModernizacji("Informacja 2");
    }
}
