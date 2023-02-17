package chapter9.intStack;

public interface IntStack {
    void push(int item);

    int pop();

    default int[] popElements(int n) {
        return getElements(n);
    }

    default int[] skipAndPopElements(int skip, int n) {
        return getElements(n);
    }

    private int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = pop();
        }
        return elements;
    }
}
