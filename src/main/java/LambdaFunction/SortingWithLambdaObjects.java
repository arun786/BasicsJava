package LambdaFunction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithLambdaObjects {

    public static void main(String[] args) {

        Student s1 = new Student("1", "Arun", 101);
        Student s2 = new Student("2", "Crun", 103);
        Student s3 = new Student("3", "Brun", 104);
        Student s4 = new Student("4", "Drun", 107);
        Student s5 = new Student("5", "Grun", 103);
        Student s6 = new Student("6", "Frun", 101);
        Student s7 = new Student("7", "Erun", 20);


        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7);
        System.out.println(students);

        //Sort based on name descending

        Collections.sort(students, Comparator.comparing(Student::getName).reversed());
        System.out.println(students);

        //Sort student in ascending order by age
        Collections.sort(students, Comparator.comparing(Student::getAge));
        System.out.println(students);

    }
}


@Getter
@Setter
@AllArgsConstructor
@ToString
class Student {
    private String id;
    private String name;
    private Integer age;
}