package Streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UseOfReduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        //To find the sum of all the numbers
        Integer reduce = numbers.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        //To Concat Strings
        List<String> alphabets = Arrays.asList("A", "B", "C", "D");
        Optional<String> letters = alphabets.stream().reduce(String::concat);
        letters.ifPresent(System.out::println);
    }
}
