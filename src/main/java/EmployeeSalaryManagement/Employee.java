package EmployeeSalaryManagement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    private String name;
    private String designation;
    private double salary;
    private String city;
}
