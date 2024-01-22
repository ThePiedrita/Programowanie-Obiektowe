package zadanie1;

public class Main {
    public static void main(String[] args) {
        try{
            sprawdzFormatDanych("j.gora@wp.com");
            sprawdzFormatDanych("zly email");
        }catch (NiepoprawnyFormatDanychException e){
            System.out.println("Blad: "+ e.getMessage());
        }

    }
    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException{
        String wzorzecEmail = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,6}$";
        if(!dane.matches(wzorzecEmail)){
            throw new NiepoprawnyFormatDanychException("niepoprawny format danych");
        }else
            System.out.println(dane);

    }
}
