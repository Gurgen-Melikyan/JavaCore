package chapter14;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println(+iob.max());
        System.out.println(+iob.min());
        System.out.println(+cob.max());
        System.out.println(+cob.min());

    }
}
