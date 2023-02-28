package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};

        ArrayUtil au = new ArrayUtil();
        au.evenCount(array);

        au.oddCount(array);

        au.maxOfArray(array);

        au.minOfArray(array);
    }
}