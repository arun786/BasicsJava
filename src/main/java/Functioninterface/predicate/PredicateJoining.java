package Functioninterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateJoining {
    public static void main(String[] args) {


        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> evenNumber = i -> i % 2 == 0;
        Predicate<Integer> greaterThan5 = i -> i > 5;

        //Even numbers
        List<Integer> evenNumbers = number.stream().filter(evenNumber).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //odd numbers
        List<Integer> oddNumber = number.stream().filter(evenNumber.negate()).collect(Collectors.toList());
        System.out.println(oddNumber);

        //even and greaterThan5
        List<Integer> evenAndGt5 = number.stream().filter(evenNumber.and(greaterThan5)).collect(Collectors.toList());
        System.out.println(evenAndGt5);

        List<Integer> oddAndLt5 = number.stream().filter(evenNumber.negate().and(greaterThan5.negate())).collect(Collectors.toList());
        System.out.println(oddAndLt5);

        List<Integer> evenOrGT5 = number.stream().filter(evenNumber.or(greaterThan5)).collect(Collectors.toList());
        System.out.println(evenOrGT5);
    }
}
