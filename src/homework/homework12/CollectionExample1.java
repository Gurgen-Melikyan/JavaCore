package homework.homework12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("poxos");
        names.add("armen");
        names.add("gagik");
        names.add("suren");
        names.add("martiros");

        boolean isRun = true;
        while (isRun) {
            System.out.println("please input 1 for choose name");
            System.out.println("please input 2 for delete name");
            System.out.println("please input 3 for add name by index");
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    System.out.println("please input name");
                    String name = scanner.nextLine();
                    if (names.contains(name)) {
                        System.out.println(name + " ka");
                    } else {
                        System.out.println(name + " chka");
                    }
                    break;
                case "2":
                    System.out.println("please input name for delete");
                    String nameForDelete = scanner.nextLine();
                    if (names.contains(nameForDelete)) {
                        names.remove(nameForDelete);
                        for (String s : names) {
                            System.out.println(s);
                        }
                    }else {
                        System.out.println("there is name not found");
                    }
                    break;
                case "3":
                    try {
                        System.out.println("please input index  for add name by index");
                        String index = scanner.nextLine();
                        System.out.println("please input name");
                        String newName = scanner.nextLine();
                        names.add(Integer.parseInt(index),newName);
                        for (String s : names) {
                            System.out.println(s);
                        }
                        System.out.println("name  added");
                    }catch (NumberFormatException e){
                        System.out.println("please input numbers not word ");
                    }

                    break;
                default:
                    System.out.println("please try again");
            }
        }
    }
}