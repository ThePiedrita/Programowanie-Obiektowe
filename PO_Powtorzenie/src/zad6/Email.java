package zad6;

public class Email implements Powiadomienie{
    @Override
    public void wyślij(String wiadomość) {
        System.out.println("jakaś wiadomość z e-maila: "+ wiadomość);
    }
}
