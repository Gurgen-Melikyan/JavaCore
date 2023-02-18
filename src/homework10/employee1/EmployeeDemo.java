package homework10.employee1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();
    static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompanyName(companyName);
                    break;
                case "5":
                    System.out.println("Please input salary range from");
                    double Salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input salary range to");
                    String Salary2 = scanner.nextLine();
                    employeeStorage.searchEmployeeBySalary(Salary, Double.parseDouble(Salary2));
                case "6":
                    System.out.println("Please input employeeId");
                    String id = scanner.nextLine();
                    System.out.println("Please input new position");
                    String position = scanner.nextLine();
                    employeeStorage.changeEmployeeById(id, position);
                    break;
                case "7":
                    employeeStorage.printActiveEmployees();
                    break;
                case "8":
                    System.out.println("Please input employee id");
                    String s1 = scanner.nextLine();
                    employeeStorage.inactiveEmployeeById(s1);
                    break;
                case "9":
                    System.out.println("Please input employee id");
                    String activate = scanner.nextLine();
                    employeeStorage.activateEmployeeById(activate);
                    break;
                default:
                    System.out.println("wrong command try again");
            }
        }
    }

    private static void printCommands() {
        System.out.println("please input 0 for exit");
        System.out.println("please input 1 for add employee");
        System.out.println("please input 2 for print employee");
        System.out.println("please input 3 for search employee by id");
        System.out.println("please input 4 for search employee by company");
        System.out.println("Please input 5 for search employee by salary range");
        System.out.println("Please input 6 for change employee position by id");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactive employee by id");
        System.out.println("Please input 9 for activate employee by id");
    }

    private static void getEmployeeById() {
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Employee with " + employeeId + " does not exists");
        } else {
            System.out.println(employee);
        }
    }

    public static void addEmployee() throws ParseException {
        System.out.println("please input name,surname,employeeId,salary,company,position,date(10/11/2002)");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        String date = employeeData[6];
        Date date1 = sdf.parse(date);
        Date newDate = new Date();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            Employee newEmployee = new Employee(employeeData[0], employeeData[1], employeeId, Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5], date1, new Date());
            employeeStorage.add(newEmployee);
            System.out.println("Employee was add");
        } else {
            System.out.println("employee with" + employeeId + "already exists");
        }
    }

}
//gug,gug,a0001,90000,epam,dm,07-04-2002
//pox,pox,a0002,452,epam,mid,09-06-2000