package classwork.chapter12;

import java.util.Scanner;

public class UserDemo {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user = new User();
        user.name = "poxos";
        user.surname = "poxosyan";
        user.language = Language.ENG;
        System.out.println("please choose language from");
        Language[] values = Language.values();
        for (Language value : values) {
            System.out.println(value);
        }
        String langStr = scanner.nextLine();
        try {
            user.language = Language.valueOf(langStr);//String tanq enum-i tip het ta
            System.out.println(user.language);
            System.out.println("you choose " +user.language.getCountry()+" country");
            System.out.println("Ordinal " +user.language.ordinal());// dasavorutuny
        } catch (IllegalArgumentException e) {
            System.out.println("please choose correct language");
        }


        // String lang = user.language.name();//enum ից String ստանալու համար
        //   System.out.println(lang);
    }
}
