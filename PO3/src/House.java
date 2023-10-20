public class House {
    public int area;
    public int rooms;
    public int floors;
    public boolean garage;
    public boolean garden;

    public int getPrice(){
        return area*3000;
    }

}
