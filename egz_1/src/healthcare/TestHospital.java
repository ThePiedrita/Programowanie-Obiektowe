package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital hospital1 = new Hospital("Szpital 1",150);
        Hospital hospital2 = new Hospital("Szpital 2",-10);
        Hospital hospital3 = new Hospital(null,20);
        Hospital hospital4 = new Hospital("Szpital 1",150);
        Hospital hospital5 = new Hospital("Szpital 5",150);
        System.out.println(hospital1);
        System.out.println(hospital1.hashCode());
        System.out.println(hospital2);
        System.out.println(hospital2.hashCode());
        System.out.println(hospital3);
        System.out.println(hospital3.hashCode());
        System.out.println(hospital4);
        System.out.println(hospital5);


        System.out.println(hospital1.equals(hospital4));
        System.out.println(hospital1.equals(hospital5));
        System.out.println();
        System.out.println("Kliniki:\n");
        Clinic klinika1 = new Clinic("Klinika 1", 200, 3.4);
        Clinic klinika2 = new Clinic("Klinika 2", 200, 6);
        Clinic klinika3 = new Clinic("Klinika 3", -10, -3);
        Clinic klinika4 = new Clinic(null, 200, 3.4);
        Clinic klinika5 = new Clinic("Klinika 1", 200, 3.4);
        Clinic klinika6 = new Clinic("Klinika 6", 20, 5);
        System.out.println(klinika1);
        System.out.println(klinika1.hashCode());
        System.out.println(klinika2);
        System.out.println(klinika3);
        System.out.println(klinika4);
        System.out.println(klinika4.hashCode());
        System.out.println(klinika5);
        System.out.println(klinika6);
        System.out.println();
        System.out.println(klinika1.equals(klinika5));
        System.out.println(klinika1.equals(klinika6));


    }
}
