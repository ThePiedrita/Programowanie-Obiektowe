public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(){
        if (age < 0)
        {
            age = 0;
        }
        if (firstName == null)
        {
            firstName = "";
        }else
            firstName = "";
        if (lastName == null)
        {
            lastName = "";
        }else
            lastName = "";

    }

    @Override
    public String toString(){
        return ("Person: "+
                firstName + " " + lastName +
                ",Age: "+ age + ".");
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof Person temp) {
            return (this.firstName.equals(temp.firstName) &&
                    this.lastName.equals(temp.lastName) &&
                    this.age == temp.age);


        }else
            return false;

    }

}
