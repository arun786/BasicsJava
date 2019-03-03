package Functioninterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateToRemoveNullValueAndEmptyString {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("arun", " ", null, "adwiti", "pushpa", "ayan");

        Predicate<String> emptyNot = s -> s.length() != 0;
        Predicate<String> nullNot = s -> s != null;

        List<String> filteredNames = names.stream().filter(nullNot.and(emptyNot)).collect(Collectors.toList());
        System.out.println(filteredNames);


    }
}
