package Functioninterface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MixOfPredicateConsumerFunction {

    public static void main(String[] args) {

        List<Student> students = populate();
        //To display all the students who have scored more than 60 marks with grade

        Predicate<Student> gt60P = p -> p.getMarks() >= 60;
        Function<Student, String> gradeFunction = f -> {
            if (f.getMarks() > 75) {
                return "A";
            } else if (f.getMarks() > 65) {
                return "B";
            } else if (f.getMarks() > 55) {
                return "C";
            } else if (f.getMarks() > 45) {
                return "D";
            } else {
                return "E";
            }
        };


        Consumer<Student> display = d -> {
            System.out.println("Name : " + d.getName());
            System.out.println("Marks : " + d.getMarks());
            System.out.println("Grade : " + gradeFunction.apply(d));
        };

        students.stream().filter(gt60P).forEach(display);

    }

    public static List<Student> populate() {
        Student s1 = new Student("Arun", 80);
        Student s2 = new Student("Brun", 70);
        Student s3 = new Student("Crun", 60);
        Student s4 = new Student("Drun", 50);
        Student s5 = new Student("Erun", 40);
        Student s6 = new Student("Frun", 30);

        return Arrays.asList(s1, s2, s3, s4, s5, s6);
    }
}

@AllArgsConstructor
@Getter
@Setter
@ToString
class Student {
    private String name;
    private Integer marks;
}
