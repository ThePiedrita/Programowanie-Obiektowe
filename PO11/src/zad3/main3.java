package zad3;

public class main3 {
    public static void main(String[] args) {
        try {
            sprawdzFormatDanych("b.slesinski@gmial.com");
            sprawdzFormatDanych("zly emial");
        } catch (NiepoprawnyFormatDanychException e) {
            System.out.println("blad: "+e.getMessage());
        }

    }

    public static void sprawdzFormatDanych(String email) throws NiepoprawnyFormatDanychException {
        String wzorzecEmail = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,6}$";
        if (!email.matches(wzorzecEmail))
            throw new NiepoprawnyFormatDanychException("Niepoprawny format danych");
        System.out.println(email);

    }
}
