package Functioninterface.fuctionInterfacce;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeMainForIncrementing {
    public static void main(String[] args) {


        //Condition persons whose salary is less than 3500, increment it by 477
        List<Employee> employees = Util.populate();
        System.out.println("Before Incrementing");
        System.out.println(employees);

        Predicate<Employee> predicate = employee -> employee.getSalary() < 3500;

        Function<Employee, Employee> functionToIncrement = employee -> {
            double salary = employee.getSalary() + 477;
            employee.setSalary(salary);
            return employee;
        };

        employees.forEach(employee -> {
                    if (predicate.test(employee)) {
                        functionToIncrement.apply(employee);
                    }
                }
        );

        System.out.println("After Incrementing");
        System.out.println(employees);
    }
}
