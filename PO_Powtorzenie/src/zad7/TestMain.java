package zad7;

public class TestMain {
    public static void main(String[] args) {
        /*try{
            sprawdzFormatDanych("Ala ma kota");
            sprawdzFormatDanych("Ala");
        }catch(NiepoprawnyFormatDanychException e){
            System.out.println("za krótkie");
        }*/

    }
    public void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException{
        if(dane.length()<4){
            throw new NiepoprawnyFormatDanychException("Dane krótsze niż 4");

        }
        System.out.println("Poprawne");


    }
}
