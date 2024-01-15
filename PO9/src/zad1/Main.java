package zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lapTimes = new ArrayList<>();
        lapTimes.add(10);
        lapTimes.add(14);
        lapTimes.add(5);
        lapTimes.add(17);
        Athlete sportowiec = new Athlete("Zbyszek",lapTimes);
        Athlete sklonowany;

        try {
            sklonowany = (Athlete) sportowiec.clone();
            System.out.println(sportowiec.lapTimes);
            System.out.println(sklonowany.lapTimes);
            sklonowany.lapTimes.set(1,2);
            System.out.println();
            System.out.println(sportowiec.lapTimes);
            System.out.println(sklonowany.lapTimes);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }


}