package zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int a = pobierzLiczbe(scanner);
        System.out.println("Podaj drugą lcizbe: ");
        int b = pobierzLiczbe(scanner);

        System.out.println(dzielenie(a,b));


    }
    public static int pobierzLiczbe(Scanner scanner){
        while (true){
            try{
                return scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("bład, podaj inną liczbe");
                scanner.next();
            }
        }
    }
    public static int dzielenie(int a,int b){
        if(b==0)
            throw new ArithmeticException("nie dziel przez 0");
        return a/b;
    }

}
