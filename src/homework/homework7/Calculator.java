package homework.homework7;

public class Calculator {
    double x;
    double y;

    double plus(double x, double y) {
        return x + y;
    }

    double minus(double x, double y) {
        return x - y;
    }

    double multiply(double x, double y) {
        return x * y;
    }

    double divide(double x, double y) {
        if (y == 0) {
            System.out.println("թիվը 0 ի չի բաժանվում");
            return -1;
        }
        return x / y;
    }

//    void setDim(double x, double y) {
//        this.x = x;
//        this.y = y;

    }


