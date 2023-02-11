package chapter8;

public class BoxDemo {
    public static void main(String[] args) {

        Box1 myBox1 = new Box1(2, 3, 5);
        Box1 myBox2 = new Box1(2, 3, 5);
        Box1 myBox3 = myBox1;
        boolean equals = myBox1.equals(myBox3);
        System.out.println(equals);
        System.out.println(myBox1.hashCode());
        System.out.println(myBox2.hashCode());
    }

}