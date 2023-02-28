package homework.homework10.employee1.storage;

import homework.homework10.employee1.model.Company;
import homework.homework10.employee1.model.Employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (employees.length == size) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee getEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchByCompany(Company company) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equals(company)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void searchEmployeeBySalary(double x, double y) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= x && employees[i].getSalary() <= y) {
                System.out.println(employees[i]);
            }
        }
    }
//    public void inactiveEmployeeById(String id) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i].getEmployeeId().contains(id)) {
//                employees[i].setActive(false);
//
//            }
//        }
//    }

    public void activateEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id) && !employees[i].isActive()) {
                employees[i].setActive(true);
            }
            System.out.println("Error");
        }
    }

    public void printActiveEmployees() {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive()) {
                System.out.println(employees[i]);
            }
        }
    }

    public void changeEmployeeById(String id, String position) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                employees[i].setEmployeeId(id);
                employees[i].setPosition(position);
            }
        }
    }

}