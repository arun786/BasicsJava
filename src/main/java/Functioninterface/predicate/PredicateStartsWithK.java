package Functioninterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateStartsWithK {
    public static void main(String[] args) {
        String[] names = {"Sachin", "Kailash", "Dravid", "Kaif"};
        Predicate<String> nameStartingWithK = s -> s.startsWith("K");

        for (String name : names
        ) {
            if (nameStartingWithK.test(name)) {
                System.out.println(name + " starts with k");
            }

        }

        // using Lambda

        List<String> cricketers = Arrays.asList("Sachin", "Kailash", "Dravid", "Kaif");
        List<String> nameWithk = cricketers.stream().filter(name -> nameStartingWithK.test(name)).collect(Collectors.toList());
        System.out.println(nameWithk);
    }
}
