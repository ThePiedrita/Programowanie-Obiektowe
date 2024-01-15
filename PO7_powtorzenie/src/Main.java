import java.util.Arrays;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        int[] tab1 = {1,2,3};
        int[] tab2 = {4,5,6};
       //ArrayList<Integer> wynik = mergeArrays(tab1,tab2);
        //System.out.println(wynik);
        //StringBuilder zdanie = new StringBuilder("Ala3mA51oTa");
        //capitalizeEverySecond(zdanie);
        //System.out.println(zdanie);
        Musician muzyk = new Musician("muzyk","fajny");
        Guitarist gitarzysta = new Guitarist("gitarzysta","super","elektryk");
        System.out.println(muzyk.toString());
        System.out.println(gitarzysta.toString());
        StringBuilder piosenka = muzyk.writeSong(4);
        StringBuilder piosenkaGitarowa = gitarzysta.writeSong(4);
        System.out.println(piosenka);
        System.out.println(piosenkaGitarowa);
    }
    /*public static void mergeArrays(int[] tab1, int[] tab2){
        int[] merge = new int[tab1.length+ tab2.length];

        int i = 0;
        while(i< tab1.length){
            merge[i]=tab1[i];
            i++;
        }
        for (int k : tab2) {
            merge[i] = k;
            i++;
        }
        for (int a: merge){
            System.out.println(a);
        }
    }*/
    public static void capitalizeEverySecond(StringBuilder zdanie)
    {
        for(int i = 1 ; i < zdanie.length(); i += 2)
        {
            zdanie.setCharAt(i,Character.toUpperCase(zdanie.charAt(i)));
            //zrozumiec setChar at i charAt
        }
    }
    public static ArrayList<Integer> mergeArrays(int[] tab1, int[] tab2) {
        ArrayList<Integer> wynik = new ArrayList<>();
        for (int i = 0; i < tab1.length; i++) {
            wynik.add(tab1[i]);
        }
        for (int i = 0; i < tab2.length; i++) {
            wynik.add(tab2[i]);
        }
        return wynik;
    }
    /*public static void capitalizeEverySecond(StringBuilder sb){
        for(int i = 1; i < sb.length();i+=2){
            char znak = sb.charAt(i);
            char znakDuzy = Character.toUpperCase(znak);
            sb.setCharAt(i,znakDuzy);
        }
    }*/

}