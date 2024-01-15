package zad5;

public class TestMain {
    public static void main(String[] args) {
        ElementPair<Circle> c1 = new ElementPair<>(new Circle(5,4),new Circle(2,5));
        System.out.println(findLargest(c1));
    }
    public static Shape findLargest(ElementPair<? extends Shape>pair){
        if(Integer.compare(pair.obj1.size,pair.obj2.size)<0){
            return pair.obj1;
        }
        return pair.obj2;

    }
}
