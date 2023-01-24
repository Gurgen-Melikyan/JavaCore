package chapter7;

public class AccessTest {
    public static void main(String[] args) {
        TestT ob = new TestT();
        ob.a = 10;
        ob.b = 20;
        ob.setc(100);
        System.out.println("a,b and c: " + ob.a + " "
        + ob.b + " " + ob.getc());
    }
}
