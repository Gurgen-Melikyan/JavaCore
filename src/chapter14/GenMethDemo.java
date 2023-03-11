package chapter14;


public class GenMethDemo {
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) {
            System.out.println("Чиcлo 2 содержится в массиве nums");
        }
        if (!isIn(7, nums)) {
            System.out.println("Чиcлo 7 отсутствуетв массиве nums");
        }
        System.out.println();

        String[] strs = {"odin", "dva", "tri", "chetiri", "pyat"};

        if (isIn("dva", strs)) {
            System.out.println("dva  содержится в массиве strs");
        }
        if (!isIn("sem", strs)) {
            System.out.println("sem отсутствует в массиве strs");
        }

    }
}
