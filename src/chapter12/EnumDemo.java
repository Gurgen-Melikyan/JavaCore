package chapter12;


public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        System.out.println(Apple.WINESAP.getPrice());
        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.getPrice());
        }
        
    }
}
