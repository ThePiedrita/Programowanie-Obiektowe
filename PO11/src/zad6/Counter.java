package zad6;

public class Counter <T>{
    private int count;
    public Counter(){
        this.count=0;
    }
    public void add(T element) {
        count++;
    }

    public int getCount() {
        return count;
    }
}
