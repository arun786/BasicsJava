package LambdaFunction;

import java.util.Map;
import java.util.TreeMap;

public class SortingWithLambdaForMap {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new TreeMap<>();
        numbers.put(1, "one");
        numbers.put(3, "three");
        numbers.put(2, "two");
        numbers.put(5, "five");
        numbers.put(4, "four");

        System.out.println(numbers);

        //o/p {1=one, 2=two, 3=three, 4=four, 5=five}

        //in descending order
        numbers = new TreeMap<>((a, b) -> b - a);
        numbers.put(1, "one");
        numbers.put(3, "three");
        numbers.put(2, "two");
        numbers.put(5, "five");
        numbers.put(4, "four");

        System.out.println(numbers);
    }
}
