package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator xy = new Calculator();

        System.out.println(xy.plus(2,3));
        System.out.println(xy.minus(4,4));
        System.out.println(xy.multiply(7,6));
        System.out.println(xy.divide(9,0));
        System.out.println(xy.divide(39,65));
    }
}
