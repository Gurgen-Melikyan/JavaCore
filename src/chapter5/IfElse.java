package chapter5;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "dzmer";
        else if (month == 3 || month == 4 || month == 5)
            season = "garun ";
        else if (month == 6 || month == 7 || month == 8)
            season = "amar";
        else if (month == 9 || month == 10 || month == 11)
            season = "asun";
        else
            season = "chka";
        System.out.println("april " + season);
    }
}