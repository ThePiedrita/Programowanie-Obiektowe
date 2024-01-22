package interfejsy4;

public class Discord implements Powiadomienie{
    @Override
    public void wyślij(String wiadomość) {
        System.out.println("Wiadomość wysłana z discorda: "+wiadomość);
    }
}
