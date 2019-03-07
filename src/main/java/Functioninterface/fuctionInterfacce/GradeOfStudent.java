package Functioninterface.fuctionInterfacce;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class GradeOfStudent {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        populateStudent(students);

        Function<Student, String> function = f -> {
            int marks = f.getMarks();
            if (marks > 80) {
                return "A";
            } else if (marks > 60 && marks < 80) {
                return "B";
            } else {
                return "C";
            }
        };

        students.forEach(student -> {
            System.out.println("Name :" + student.getName());
            System.out.println("Marks :" + student.getMarks());
            System.out.println("Grade :" + function.apply(student));
        });

    }

    static void populateStudent(List<Student> students) {
        Student s1 = new Student("Arun", 100);
        Student s2 = new Student("Barun", 35);
        Student s3 = new Student("Carun", 55);
        Student s4 = new Student("Darun", 65);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

    }
}

@Getter
@Setter
@AllArgsConstructor
class Student {
    private String name;
    private int marks;
}
