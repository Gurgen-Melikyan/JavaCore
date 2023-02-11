package chapter8;

public class Box1 {
    double width;
    double height;
    double depth;

    public Box1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box1 box1 = (Box1) o;

        if (Double.compare(box1.width, width) != 0) return false;
        if (Double.compare(box1.height, height) != 0) return false;
        return Double.compare(box1.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Box1) {
//            Box1 box = (Box1) obj;
//            return box.width == width &&
//                    box.height == height
//                    && box.depth == depth;
//        }
//        return false;
//    }
}
