package classwork.compareList;

import java.util.*;

public class CompareListExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("poxos", "poxosyan", 12));
        studentList.add(new Student("arzuman", "petrosyan", 44));
        studentList.add(new Student("avo", "avetisya", 54));

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getSurName().compareTo(o2.getSurName());
            }
        });


        System.out.println(studentList);
    }
}
