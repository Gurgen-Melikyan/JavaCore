package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println(max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        int[] array1 = {1, 2, 3, 0, 7, 99, 85, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != 0) {
                System.out.print(array1[i] + " ");
            }
        }
    }
}
