package healthcare;

import java.util.Objects;

public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity){
        if(name == null){
            this.name = "";
        }else
            this.name = name;
        if(capacity<0)
            this.capacity = 50.0;
        else
            this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null)
            this.name = "";
        else
            this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity){
        if (capacity<0)
            this.capacity = 50;
        else
            this.capacity = capacity;
    }

    @Override
    public String toString() {
        if(this.name.isEmpty())
            return "Hospital: Capacity: "  + capacity +
                '.';
        else
            return "Hospital: " +
                    "Name: " + name  +
                    ". Capacity: " + capacity +
                    '.';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Hospital temp){
            return (this.name.equals(temp.name)&& this.capacity == temp.capacity);
        }else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
