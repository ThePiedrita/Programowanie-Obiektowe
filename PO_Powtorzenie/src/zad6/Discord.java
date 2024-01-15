package zad6;

public class Discord implements Powiadomienie{

    @Override
    public void wyślij(String wiadomość) {
        System.out.println("jakaś wiadomość z Discorda: "+ wiadomość);
    }
}
