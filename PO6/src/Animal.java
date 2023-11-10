public class Animal {
    public String name;
    public Animal(){}

    public Animal(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Animal temp){
            return this.name.equals(temp.name);
        }else
            return false;
    }
    public void makeNoise(){
        System.out.println("Jakiś dźwięk zwierzęcia");
    }
}
class Cat extends Animal{

    public Cat(){}
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau");
    }
}
