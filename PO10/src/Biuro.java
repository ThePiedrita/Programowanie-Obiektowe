public class Biuro implements Printer{
    private Printer printer;
    public Biuro(Printer printer){
        this.printer = printer;
    }
    public void drukujDokument(String tekst){
        printer.drukuj(tekst);
    }

    @Override
    public void drukuj(String tekst) {
    }
}
