public class Istota {
    public Istota(){
        System.out.println("istota");
    }
}
class Człowiek extends Istota {
    public Człowiek(){
        System.out.println("człowiek");
    }
}
class Programista extends Człowiek {
    public Programista(){
        System.out.println("programista");
    }
}
