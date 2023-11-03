public class Vehicle {
    public String brand;
    public String model;
    public int yearOfProduction;

    public Vehicle(){
        yearOfProduction = 2023;
        brand = "";
        model = "";
    }
    @Override
    public String toString(){
        return("Vehicle: "+
                brand + " " + model +
                ",Year: "+ yearOfProduction + ".");
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof Vehicle temp) {
            return (this.brand.equals(temp.brand) &&
                    this.brand.equals(temp.brand) &&
                    this.yearOfProduction == temp.yearOfProduction);

        }else
            return false;
    }
}
