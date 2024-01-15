public class Samochod implements Silnik{
    private Silnik silnik;
    public Samochod(Silnik silnik){
        this.silnik = silnik;
    }
    public void start(){
        silnik.uruchom();
    }
    public void  stop(){
        silnik.zatrzymaj();
    }


    @Override
    public void uruchom() {

    }

    @Override
    public void zatrzymaj() {

    }
}
