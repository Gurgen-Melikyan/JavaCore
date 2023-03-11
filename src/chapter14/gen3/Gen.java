package chapter14.gen3;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }
    T getOb(){
        return ob;
    }
}
