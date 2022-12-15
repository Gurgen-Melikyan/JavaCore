package chapter2;

public class BlockTest {
    public static void main(String[] args) {
//        int x, y;
//        y = 20;
//        for (x = 0; x < 10; x++) {
//            System.out.println("x " + x);
//            System.out.println("y " + y);
//            y = y - 2;
//        }
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < i; j++){
//                System.out.print("*");
//
//
//            }
//            System.out.println();
//        }
//        for (int i = 5; i > 0; i--) {
//            for (int j = i; j > 0; j--) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
        for (int i = 0; i <5 ; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");

            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

}
