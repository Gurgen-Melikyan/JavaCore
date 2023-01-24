package chapter7;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box(10, 20, 15);
        Box mybox1 = new Box();
        Box mycube = new Box(7);
        double vol;

        Box myclone = new Box(mybox);

        vol = mybox1.volume();
        System.out.println("mybox1 " + vol);
        vol = mybox.volume();
        System.out.println("mybox " + vol);
        vol = mycube.volume();
        System.out.println("mycube " + vol);

        vol = myclone.volume();
        System.out.println("Oбъeм клона равен " + vol);

    }
}
