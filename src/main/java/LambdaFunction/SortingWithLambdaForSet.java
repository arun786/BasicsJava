package LambdaFunction;

import java.util.Set;
import java.util.TreeSet;

public class SortingWithLambdaForSet {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(1);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);
        numbers.add(21);
        numbers.add(4);

        //treeset will automatically sort the numbers in ascending order
        System.out.println(numbers);

        //Inorder to sort it in descending order
        numbers = new TreeSet<>((a, b) -> b - a);
        numbers.add(10);
        numbers.add(1);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);
        numbers.add(21);
        numbers.add(4);

        System.out.println(numbers);


    }
}
