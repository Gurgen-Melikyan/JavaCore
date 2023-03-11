package chapter14.gen3;

public class HierDemoЗ {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);

        Gen2<Integer> iob2 = new Gen2<>(99);

        Gen2<String> strOb2 = new Gen2<>("gen");

        if (iob2 instanceof Gen2<?>){
            System.out.println("true");
        }

        if (iob2 instanceof Gen<?>){
            System.out.println("true");

        }
        System.out.println();


    }
}
