package homework.homework12;

import java.util.*;

public class CollectionExample2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Set<String[]> names = new HashSet<>();
        Set<String[]> names1 = new LinkedHashSet<>();


        boolean isRun = true;
        while (isRun) {
            System.out.println("please input 1 for add names");
            System.out.println("please input 2 add sorting names");
            String commands = scanner.nextLine();
            switch (commands) {
                case "1":
                    System.out.println("please input 5 names");
                    String name = scanner.nextLine();
                    String[] data = name.split(",");
                    names.add(data);
                    for (String datum : data) {
                        System.out.println(datum);
                    }
                    break;
                case "2":
                    System.out.println("please inout names");
                    String s = scanner.nextLine();
                    String[] split = s.split(",");
                    names1.add(split);
                    for (String s1 : split) {
                        System.out.println(s1);
                    }
                    break;
                default:
                    System.out.println("try again");
            }
        }
    }


}