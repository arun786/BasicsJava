package Streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OfficeProjectScenario {

    public static void main(String[] args) {
        Student s1 = new Student(1, 4);
        Student s2 = new Student(2, 3);
        Student s3 = new Student(3, 2);
        Student s4 = new Student(4, 1);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        List<Student> collect = students.stream().filter(s -> s.getSalary() > 3).collect(Collectors.toList());

        List<Student> collect1 = students.stream().filter(s -> collect.stream().allMatch(ss -> ss.getSalary() != s.getSalary()))
                .filter(s -> s.getSalary() > 2)
                .collect(Collectors.toList());

        List<Student> collect2 = students.stream().filter(s -> collect.stream().allMatch(ss -> ss.getSalary() != s.getSalary()) && collect1.stream().allMatch(ss -> ss.getSalary() != s.getSalary()))
                .filter(s -> s.getSalary() > 1)
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(collect1);
        System.out.println(collect2);
    }
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Student {
    private int salary;
    private int age;
}
