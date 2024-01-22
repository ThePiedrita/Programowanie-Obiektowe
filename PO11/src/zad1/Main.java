package zad1;


public class Main {
    public static void main(String[] args) {

        checkAge(20);

    }
    static void checkAge(int age){
        if(age<18)
            throw new IllegalArgumentException("Osoba musi być pewłnoletnia");
        else
            System.out.println("wiek: "+age);
    }
}