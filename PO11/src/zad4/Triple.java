package zad4;

public class Triple<T, U, V> {
    T value1;
    U value2;
    V value3;

    public Triple(T value1, U value2, V value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1() {
        return value1;
    }

    public U getValue2() {
        return value2;
    }

    public V getValue3() {
        return value3;
    }
}
