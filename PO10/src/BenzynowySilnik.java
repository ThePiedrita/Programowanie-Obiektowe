public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("silnik działa");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik nie działa");

    }
}
