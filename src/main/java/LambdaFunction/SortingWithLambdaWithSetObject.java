package LambdaFunction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingWithLambdaWithSetObject {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "one");
        Employee employee2 = new Employee(11, "eleven");
        Employee employee3 = new Employee(12, "twelve");
        Employee employee4 = new Employee(13, "thirteen");


        Set<Employee> employees = new TreeSet<>(Comparator.comparing(Employee::getId));
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        System.out.println(employees);

        //[Employee(id=1, name=one), Employee(id=11, name=eleven), Employee(id=12, name=twelve), Employee(id=13, name=thirteen)]

    }
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Employee {
    private int id;
    private String name;
}
