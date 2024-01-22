package interfejsy2;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Silnik działa");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik zatrzymany");

    }
}
