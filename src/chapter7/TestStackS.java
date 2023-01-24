package chapter7;

public class TestStackS {
    public static void main(String[] args) {
        StackS mystack1 = new StackS();
        StackS mysteck2 = new StackS();
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mysteck2.push(i);
        }
        System.out.println("Стек в mystack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Стек в mystack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mysteck2.pop());
        }
    }
}
