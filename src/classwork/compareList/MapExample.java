package classwork.compareList;

import classwork.compareList.Student;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<Company, Integer> companyIntegerMap = new TreeMap<>(new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        Person person = new Person("poxos", "poxosyan");
        Person petros = new Person("petya", "poxosyan");
        Company company = new Company("a001", "Company 2", person);
        Company company2 = new Company("a002", "Company 1", petros);
        Company company3 = new Company("a003", "Company 3", petros);


        companyIntegerMap.put(company, 20);
        companyIntegerMap.put(company2, 10);
        companyIntegerMap.put(company3, 99);

        company.getDirector().setName("maro");
        company.getDirector().setSurname("poxsa");

        Set<Company> companies = companyIntegerMap.keySet();

        Collection<Integer> values = companyIntegerMap.values();

        Set<Map.Entry<Company, Integer>> entries = companyIntegerMap.entrySet();
        for (Map.Entry<Company, Integer> entry : entries) {
            System.out.println(entry.getKey().getName() + " -> " + entry.getValue());
        }
//        Map<String, Student> studentMap = new HashMap<>();
//
//        studentMap.put("kapik@mail.com", new Student("poxos", "poxosyan", 12));
//        studentMap.put("poxos@mail.com", new Student("petros", "poxosyan", 12));
//
//        Student student = studentMap.get("kapik@mail.");
//        System.out.println(student);
    }
}
