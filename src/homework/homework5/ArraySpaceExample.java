package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] result = new char[spaceArray.length];
        for (int i = 0; i < spaceArray.length; i++) {
            for (int j = 0; j < spaceArray.length; j++) {
                if (spaceArray[i] != ' ') {
                    result[i] = spaceArray[j];
                }
                System.out.print(result[i]);
            }
        }
    }
}