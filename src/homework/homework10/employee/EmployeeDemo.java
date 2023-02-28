package homework.homework10.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add employee");
            System.out.println("please input 2 for printing all employee");
            System.out.println("please input 3 for search employee by employee ID");
            System.out.println("please input 4 for search employee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("please input name");
                    String name = scanner.nextLine();
                    System.out.println("please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("please input emplyeeID");
                    String emplyeeID = scanner.nextLine();
                    System.out.println("please input salary");
                    String salary = scanner.nextLine();
                    System.out.println("please input company");
                    String company = scanner.nextLine();
                    System.out.println("please input position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, emplyeeID, Double.parseDouble(salary), company, position);
                    employeeStorage.add(employee);
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("please input employee ID");
                    String employeeID = scanner.nextLine();
                    employeeStorage.searchByemployeID(employeeID);
                    break;
                case "4":
                    System.out.println("please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompanyName(companyName);
                    break;
                default:
                    System.out.println("wrong command. Please try again");
            }
        }
    }
}
