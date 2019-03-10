package Functioninterface.fuctionInterfacce;

import java.util.List;
import java.util.function.Function;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employees = Util.populate();

        //Create A function to calculate the total Salary of all employees
        Function<List<Employee>, Double> function = emps -> {
            double totalSalary = 0;
            for (Employee emp :
                    emps) {
                totalSalary += emp.getSalary();
            }
            return totalSalary;
        };

        Double totalSalary = function.apply(employees);
        System.out.println(totalSalary);

    }


}
