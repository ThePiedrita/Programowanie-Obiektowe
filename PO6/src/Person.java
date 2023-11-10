public class Person {
    private String firstName;
    protected String lastName;

    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirsName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirsName(String firsName) {
        this.firstName = firsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
class Employee extends Person{

    public Employee(String firstName, String lastName){
        super(firstName,lastName);
    }


    public void displayData(){
        System.out.println("Imie i nazwisko: "+ getFirsName() + " " + getLastName());
    }
}
