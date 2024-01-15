public class Main {
    public static void main(String[] args) {
          /*KierownikPodrozy kierownik = new KierownikPodrozy(new LotKrajowy());
          kierownik.wystawBilet();
          kierownik = new KierownikPodrozy(new KoncertSymfoniczny());
          kierownik.wystawBilet();
          kierownik = new KierownikPodrozy(new BramkaNaAutostradzie());
          kierownik.wystawBilet();*/
        /*Dog pies = new Dog();
        pies.makeNoise();
        Cat kot = new Cat();
        kot.makeNoise();*/
        /*TestMyComparator comparator = new TestMyComparator();
        int wynik = comparator.compare(1,2);
        System.out.println(wynik);*/
        /*TextProcessor text = new TextProcessor();
        System.out.println(text.processData("Poggers"));
        System.out.println(text.isValid("Poggers"));
        NumberProcessor number = new NumberProcessor();
        System.out.println(number.processData("znaki"));
        System.out.println(number.isValid("123"));*/
        /*Biuro biuro = new Biuro(new StandardowyPrinter());
        biuro.drukujDokument("siemano");*/
        Samochod samochod = new Samochod(new BenzynowySilnik());
        samochod.uruchom();
        samochod.zatrzymaj();

    }
}