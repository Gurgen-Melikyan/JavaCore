package homework8;

public class DynamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }


    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] array1 = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("սխալ ինդեքս");
            return -1;
        }
        return array[index];
    }

    public void deleteByIndex(int index) {
        if (index > size) {
            System.out.println("չկա նման էլեմենտ");
        } else
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }

        size--;
    }

    public void set(int index, int value) {
        if (index > size) {
            System.out.println("նման ինդեքսով էլեմենտ չկա");
        } else {
            array[index] = value;
            deleteByIndex(index);
        }
    }

    public void add(int index, int value) {
        if (index > size) {
            System.out.println("չկա նման ինդեքս");
        } else {
            int[] newArray = new int[size + 1];
            newArray[index] = value;
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            for (int i = index; i < size; i++) {
                newArray[i + 1] = array[i];
            }
            array = newArray;
        }
        size++;
    }

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
