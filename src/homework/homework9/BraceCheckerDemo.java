package homework.homework9;

public class BraceCheckerDemo {
    public static void main(String[] args) {
//        BraceChecker bc = new BraceChecker("Hello (from] java");
//        bc.check();
        BraceChecker bc1 = new BraceChecker("hallo) {java]");
        bc1.check();
    }
}
