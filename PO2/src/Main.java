import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println(generateRandomDouble());
        int[] tab = {3,5,6,7};
        System.out.println(Arrays.stream(tab).min().getAsInt());*/
        //piramida();
        //System.out.println(generateRandomBoolean());
        /*int[] tab = new int[15];

        for (int i = 0; i < 15; i++)
        {
            tab[i] = random.nextInt(1,100);
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        maxMin(tab);*/
        DelRep();

    }

    /*public static int generateRandomInt() {
        return random.nextInt();
    }

    public static double generateRandomDouble() {
        return random.nextDouble(0.0, 1.0);
    }*/

    public static void piramida(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak:");
        String znak = scanner.next();
        System.out.println("Podaj wysokość:");
        int wysokosc = scanner.nextInt();


        for(int i = 0; i < wysokosc;i++){
            int liczbaSpacji = wysokosc - 1 - i;
            int liczbaZnakow = 2 * i + 1;

            StringBuilder sb = new StringBuilder();
            while(liczbaSpacji-- > 0 )
                sb.append(' ');
            while( liczbaZnakow-- > 0)
                sb.append(znak);
            String doWypisania = sb.toString();
            System.out.println(doWypisania);

        }

    }
    public static double generateRandomGaussian(){
        return random.nextGaussian();
    }

    public static boolean generateRandomBoolean(){
        return random.nextBoolean();
    }

    public static void reverse(int[] tab){
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(tab[i]);
        }
    }

    public static void srednia(int[] tab){
        int suma = 0;
        int i = tab.length-1;
        while( i-- != 0){
            suma+=tab[i];
        }
        double wynik = suma/tab.length-1;
        System.out.println("Średnia:"+wynik);
    }

    public static void maxMin(int[] tab){
        int max = tab[0];
        int min = tab[0];
        for (int i = 1; i< tab.length;i++){
            if (tab[i] > max)
                max = tab[i];
            if (tab[i] < min)
                min = tab[i];

        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
    }

    public static void DelRep(){
        String napis = "banannowy";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<napis.length();i++)
        {
            char currentChar = napis.charAt(i);
            if(sb.indexOf(String.valueOf(currentChar))==-1)
            {
                sb.append(currentChar);
            }
        }
        System.out.println(sb.toString());
    }

}