import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int[] tab1 = {1, 2, 3, 4};
        int[] tab2 = {5, 6, 7};
        mergeArrays(tab1,tab2);*/

        /*StringBuilder sb = new StringBuilder("jakiś napis bez dużych liter");
        System.out.println(sb);
        capitalizeEverySecond(sb);
        System.out.println(sb);*/

        nowaOsoba newPerson = new nowaOsoba();
        System.out.println(newPerson.toString());

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
    /*public static void capitalizeEverySecond(StringBuilder sb){
        for(int i = 1; i < sb.length();i+=2){
            char znak = sb.charAt(i);
            char znakDuzy = Character.toUpperCase(znak);
            sb.setCharAt(i,znakDuzy);
        }
    }*/

}