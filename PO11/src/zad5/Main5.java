package zad5;

public class Main5 {
    public static void main(String[] args) {
        String napis1 = "napis";
        String napis2 = "coś innego";
        String napis3 = "napis";
        System.out.println(isEqual(napis1,napis2));
        System.out.println(isEqual(napis1,napis3));
        System.out.println();
        int a = 14;
        int b = 2;
        int c = 14;
        System.out.println(isEqual(a,b));
        System.out.println(isEqual(a,c));

    }
    public static <T> Boolean isEqual(T obj1,T obj2){
        if(obj1 == null && obj2==null) {
            return true;
        }
        return obj1 != null && obj1.equals(obj2);

    }
}
