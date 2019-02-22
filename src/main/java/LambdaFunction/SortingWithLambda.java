package LambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithLambda {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(105);
        numbers.add(103);
        numbers.add(10);
        numbers.add(109);
        numbers.add(102);
        numbers.add(105);

        System.out.println("Without Sorting " + numbers);

        Collections.sort(numbers);
        System.out.println("Ascending order default " + numbers);

        Collections.sort(numbers, (a, b) -> b - a);
        System.out.println("Descending order " + numbers);

        Collections.sort(numbers, Integer::compareTo);
        System.out.println("Ascending order " + numbers);
    }
}
