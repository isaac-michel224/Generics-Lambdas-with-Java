package generics;

public class GenericClass {

    T myType;

    public void add(T myType) {
        this.myType = myType;
    }

    public T getMyType() {
        return myType;
    }
}
