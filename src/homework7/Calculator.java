package homework7;

public class Calculator {
    double x;
    double y;

    double plus() {
        return x + y;
    }

    double minus() {
        return x - y;
    }

    double multiply() {
        return x * y;
    }

    double divide() {
        if (y == 0) {
            System.out.println("թիվը 0 ի չի բաժանվում");
            return -1;
        }
        return x / 2;
    }

    void setDim(double x, double y) {
        this.x = x;
        this.y = y;

    }
}

