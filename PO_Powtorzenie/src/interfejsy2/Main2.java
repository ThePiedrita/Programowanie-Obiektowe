package interfejsy2;

public class Main2 {
    public static void main(String[] args) {
        Samochód samochód = new Samochód(new BenzynowySilnik());
        samochód.start();
        samochód.stop();
    }
}
