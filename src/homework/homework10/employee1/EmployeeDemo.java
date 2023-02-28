package homework.homework10.employee1;

import homework.homework10.employee1.model.Company;
import homework.homework10.employee1.model.Employee;
import homework.homework10.employee1.storage.CompanyStorage;
import homework.homework10.employee1.storage.EmployeeStorage;
import homework.homework10.employee1.util.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();
    static CompanyStorage companyStorage = new CompanyStorage();
    static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    getEmployeeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    companyStorage.print();
                    System.out.println("please input company id");
                    String companyId = scanner.nextLine();
                    Company companyById = companyStorage.getCompanyById(companyId);
                    if (companyById != null) {
                        employeeStorage.searchByCompany(companyById);
                    } else {
                        System.out.println("Company does not exists!");
                    }
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    System.out.println("Please input salary range from");
                    double Salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input salary range to");
                    String Salary2 = scanner.nextLine();
                    employeeStorage.searchEmployeeBySalary(Salary, Double.parseDouble(Salary2));
                case CHANGE_EMPLOYEE_POSITION:
                    System.out.println("Please input employeeId");
                    String id = scanner.nextLine();
                    System.out.println("Please input new position");
                    String position = scanner.nextLine();
                    employeeStorage.changeEmployeeById(id, position);
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printActiveEmployees();
                    break;
                case INACTIVATE_EMPLOYEES:
                    inactivateEmployeeByid();
//                    System.out.println("Please input employee id");
//                    String s1 = scanner.nextLine();
//                    employeeStorage.inactiveEmployeeById(s1);
                    break;
                case ACTIVATE_EMPLOYEES:
                    System.out.println("Please input employee id");
                    String activate = scanner.nextLine();
                    employeeStorage.activateEmployeeById(activate);
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                default:
                    System.out.println("wrong command try again");
            }
        }
    }

    private static void addCompany() {
        System.out.println("please input company id,name,address,phone");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        Company companyById = companyStorage.getCompanyById(companyData[0]);
        if (companyById == null) {
            Company company = new Company(companyData[0], companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company  added!");
        } else {
            System.out.println("Company with" + companyData[0] + " already exists");
        }

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
        if (companyStorage.getSize() == 0) {
            System.out.println("please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            System.out.println("please input name,surname,employeeId,salary,position,date(10-11-2002)");
            String employeeDataStr = scanner.nextLine();
            String[] employeeData = employeeDataStr.split(",");
            String employeeId = employeeData[2];
            Date dateOfBirthday = DateUtil.stringToDate(employeeData[5]);
            Employee employee = employeeStorage.getEmployeeById(employeeId);
            if (employee == null) {
                Employee newEmployee = new Employee(employeeData[0], employeeData[1], employeeId, Double.parseDouble(employeeData[3]),
                        companyById, employeeData[4], dateOfBirthday, new Date());
                employeeStorage.add(newEmployee);
                companyById.setCountOfEmployees(companyById.getCountOfEmployees() + 1);
                System.out.println("Employee was add");
            } else {
                System.out.println("employee with" + employeeId + "already exists");
            }
        }
    }

    private static void inactivateEmployeeByid() {
        employeeStorage.printActiveEmployees();
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            employee.setActive(false);
            employee.getCompany().setCountOfEmployees(employee.getCompany().getCountOfEmployees() - 1);
            System.out.println("Employee inactivated");
        } else {
            System.out.println("Employee does not exists");
        }
    }
}
//gug,gug,a0001,90000,dm,07-04-2002
//pox,pox,a0002,452,epam,mid,09-06-2000