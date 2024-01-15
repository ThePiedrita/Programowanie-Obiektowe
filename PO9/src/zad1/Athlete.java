package zad1;

import java.util.ArrayList;

public class Athlete implements Cloneable{
    String name;
    ArrayList<Integer> lapTimes;

    public Athlete(String name, ArrayList<Integer> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
