package healthcare;

import java.util.Objects;

public class Clinic extends Hospital{
    private double rating;

    public Clinic(String name, double capacity, double rating) {
        super(name, capacity);
        if(rating<0|| rating>5)
            this.rating = 3;
        else
            this.rating = rating;

    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating<0|| rating>5)
            this.rating = 3;
        else
            this.rating = rating;
    }

    @Override
    public String toString() {
        if (getName().isEmpty())
            return "Clinic: " +
                    ". Capacity: "+ getCapacity()+
                    ".\nRating:"+ rating+'.';
        else
            return "Clinic: " +
                    "Name:" + getName() +
                    ". Capacity: "+ getCapacity()+".\nRating:"+ rating+'.';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Clinic temp)
            return (getName().equals(temp.getName()) &&
                    getCapacity() == temp.getCapacity() &&
                    this.rating == temp.rating);
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rating);
    }
}
