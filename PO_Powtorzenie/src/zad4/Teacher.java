package zad4;

public class Teacher implements Cloneable{
    String name;
    String subject;
    int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
