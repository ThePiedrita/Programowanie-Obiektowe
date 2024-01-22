package interfejsy4;

public class Email implements Powiadomienie{
    @Override
    public void wyślij(String wiadomość) {
        System.out.println("Wiadomość z emiala: "+ wiadomość);
    }
}
