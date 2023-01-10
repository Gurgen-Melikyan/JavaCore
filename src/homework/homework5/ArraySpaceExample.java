package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] result = new char[spaceArray.length];
        for (int j = 1; j < spaceArray.length - 2; j++) {
            if (spaceArray[0] == ' ') {
                result[0] = spaceArray[j];
            } else {
                result[0] = spaceArray[j];
            }
            System.out.print(result[0]);
        }
    }
}