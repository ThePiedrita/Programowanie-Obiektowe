package interfejsy3;

public class Main3 {
    public static void main(String[] args) {
        Biuro biuro = new Biuro(new StandardowyPrinter());
        biuro.drukujDokument("mamamia");
    }
}
