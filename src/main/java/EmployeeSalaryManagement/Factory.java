package EmployeeSalaryManagement;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Factory {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.populate();

        //List of Managers

        Predicate<Employee> manager = e -> e.getDesignation().equalsIgnoreCase("Manager");
        Predicate<Employee> fromMumbai = e -> e.getCity().equalsIgnoreCase("Mumbai");
        Predicate<Employee> salaryLessThan10000 = e -> e.getSalary() < 10000;

        List<Employee> managers = employees.stream().filter(manager).collect(Collectors.toList());
        System.out.println("List of Managers " + managers);

        List<Employee> empFromMumbai = employees.stream().filter(fromMumbai).collect(Collectors.toList());
        System.out.println("List of Employees from Mumbai " + empFromMumbai);

        List<Employee> employeeSalaryLessThan10000 = employees.stream().filter(salaryLessThan10000).collect(Collectors.toList());
        System.out.println("Employee Salary less than 10000 " + employeeSalaryLessThan10000);

        List<Employee> employeesFromMumbaiAndSalaryLessthan10000 = employees.stream().filter(salaryLessThan10000.and(fromMumbai)).collect(Collectors.toList());
        System.out.println("Mumbai and salary less than 10000" + employeesFromMumbaiAndSalaryLessthan10000);

        List<Employee> collect = employees.stream().filter(manager.or(salaryLessThan10000)).collect(Collectors.toList());
        System.out.println("Manager and Salary less than 10000" + collect);

        List<Employee> collect1 = employees.stream().filter(manager.negate()).collect(Collectors.toList());
        System.out.println("Not Managers " + collect1);

    }
}
