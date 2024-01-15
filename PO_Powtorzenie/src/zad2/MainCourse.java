package zad2;

import java.util.ArrayList;
import java.util.Collection;

public class MainCourse {
    public static void main(String[] args){
        ArrayList<Course> c = new ArrayList<>();
        c.add(new Course("aa",5,1.5));
        c.add(new Course("bb",2,13));
        c.add(new Course("xx",5,14));
        System.out.println(c);
        System.out.println();;
        //Collection.sort(c);
        System.out.println(c);
    }
}
