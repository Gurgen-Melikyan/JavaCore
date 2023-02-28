package homework.homework5;

public class IfForExample {
    public static void main(String[] args) {
        int a, b;
        a = 20;
        b = 30;
        if (a < b) {
            System.out.println("max " + b);

        }
        for (int i = a; i <= b; i++) {
            System.out.println(i);

        }

        char c = 20;
        char x = 30;
        System.out.println("c and x " + c + " " + x);
        if (a == b) {
            System.out.println("a-ն հավասար է բ-ին ");
        } else System.out.println("a-ն հավասար չէ բ-ին։");


    }
}
