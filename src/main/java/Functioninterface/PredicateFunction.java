package Functioninterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunction {

    public static void main(String[] args) {
        Predicate<Integer> p = i -> i > 10;
        System.out.println(p.test(100));
        System.out.println(p.test(5));

        //to check the length of string is >5
        Predicate<String> p1 = i -> i.length() > 5;
        System.out.println(p1.test("abddsd"));

        //To check if collection is empty
        Predicate<Collection<String>> p2 = Collection::isEmpty;

        List<String> lst = new ArrayList<>();
        System.out.println(p2.test(lst));
    }
}
