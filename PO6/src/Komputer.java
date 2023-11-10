public class Komputer {
    public void uruchom(){
        System.out.println("Komputer uruchomiony");
    }
}
class Laptop extends Komputer {
    /*protected void uruchom(){
        super.uruchom();
    }*/
    //nie działa bo protected
}
