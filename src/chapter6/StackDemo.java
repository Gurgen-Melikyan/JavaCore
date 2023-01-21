package chapter6;

public class StackDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(40);
        myStack.push(50);
        myStack.push(59);
        myStack.push(24);
        myStack.push(55);
        myStack.push(98);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
