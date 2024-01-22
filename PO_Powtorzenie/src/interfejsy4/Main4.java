package interfejsy4;

public class Main4 {
    public static void main(String[] args) {
        Użytkownik u1 = new Użytkownik(new Email());
        Użytkownik u2 = new Użytkownik(new Discord());
        u1.powiadomOModernizacji("tu jest z emial");
        u2.powiadomOModernizacji("tu jest z discorda");
    }
}
