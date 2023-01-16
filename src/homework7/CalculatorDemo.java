package homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator xy = new Calculator();

        xy.setDim(1, 2);
        System.out.println(xy.plus());
        xy.setDim(3, 4);
        System.out.println(xy.minus());
        xy.setDim(2, 6);
        System.out.println(xy.multiply());
        xy.setDim(7, 2);
        System.out.println(xy.divide());
        xy.setDim(4, 0);
        System.out.println(xy.divide());
    }
}
