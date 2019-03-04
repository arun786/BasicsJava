package EmployeeSalaryManagement;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtil {

    public static List<Employee> populate() {
        Employee e1 = new Employee("Arun", "Architect", 15200.0, "Phoenix");
        Employee e2 = new Employee("Pushpa", "Admin", 16000.0, "Phoenix");
        Employee e3 = new Employee("Adwiti", "Manager", 20000.0, "Scottsdale");
        Employee e4 = new Employee("Mallika", "Developer", 9800.0, "Las Vegas");
        Employee e5 = new Employee("Sunny", "Developer", 5600.0, "Bangalore");
        Employee e6 = new Employee("Munny", "CEO", 90000.0, "Pune");
        Employee e7 = new Employee("Lunny", "Developer", 5600.0, "Mumbai");

        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7);
    }
}
