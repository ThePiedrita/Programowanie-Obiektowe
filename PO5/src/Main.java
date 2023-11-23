
public class Main {
    public static void main(String[] args) {
        /*JakasKlasa a = new JakasKlasa();
        JakasKlasa b = new JakasKlasa();
        //System.out.println(a);
        System.out.println(a + " " + b);
        System.out.println(a.equals(b));*/

        Person a = new Person();
        a.firstName = "jakoś";
        a.lastName = "coś";
        a.age = 14;
        Person b = new Person();
        b.firstName = "jakoś";
        b.lastName = "coś";
        b.age = 13;
        System.out.println(a.equals(b));
        System.out.println(a.toString());

        /*Vehicle a = new Vehicle();
        System.out.println(a);*/

    }
}