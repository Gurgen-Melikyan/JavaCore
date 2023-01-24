package chapter7;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Фaктopиaл 3 равен "
                + f.fact(3));
        System.out.println(f.fact(6));
    }
}
