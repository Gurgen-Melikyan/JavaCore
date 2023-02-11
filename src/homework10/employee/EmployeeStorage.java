package homework10.employee;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee[] array1 = new Employee[array.length + 10];
        for (int i = 0; i < size; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }


    public void searchByemployeID(String employeeID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmplyeeID().contains(employeeID)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("employeeID with " + employeeID + "not found!!!");
        }
    }

    public void searchByCompanyName(String companyName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().contains(companyName)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("employee with " + companyName + "not found!!!");
        }
    }
}
