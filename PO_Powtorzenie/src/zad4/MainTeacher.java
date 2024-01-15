package zad4;

public class MainTeacher {
    public static void main(String[]args){
        Teacher nauczyciel = new Teacher("Zbyszek","matma",10);
        Teacher sklonowany;

        try {
            sklonowany = (Teacher) nauczyciel.clone();
            System.out.println(nauczyciel.experience);
            System.out.println(sklonowany.experience);
            sklonowany.experience = 14;
            System.out.println();
            System.out.println(nauczyciel.experience);
            System.out.println(sklonowany.experience);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
