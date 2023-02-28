package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(23);  // 0
        dy.add(54);  // 1
        dy.add(57);  // 2
        dy.add(87);  // 3
        dy.add(99);  // 4
//        dy.add(2, 44);
//        dy.print();
//        System.out.println(dy.exists(99));
//        System.out.println(dy.getIndexByValue(99));
        System.out.println();
        dy.add(2,77);
        dy.print();

    }
}
