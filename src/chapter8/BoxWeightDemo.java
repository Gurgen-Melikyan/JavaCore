package chapter8;

public class BoxWeightDemo {
    public static void main(String[] args) {

        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;
        vol = mybox1.volume();

        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " +mybox1.weight);

        vol = mybox2.volume();


//        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
//        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
//        double vol;
//        vol = myBox1.volume();
//        System.out.println("Oбъeм mybox2 равен " + vol);
//        System.out.println("Вес mybox2 равен " + myBox1.weight);
//        System.out.println();
//
//        vol = myBox2.volume();
//        System.out.println("Oбъeм mybox2 равен " + vol);
//        System.out.println(
//                "Вес myBox2 равен " + myBox2.weight);

    }
}
