package chapter7;

public class StackS {
    private int[] stck = new int[10];
    private int tos;

    StackS() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Cтeк заполнен.");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}
