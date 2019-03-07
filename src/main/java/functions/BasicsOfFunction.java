package functions;

import java.util.function.Function;

public class BasicsOfFunction {

    public static void main(String[] args) {
        Function<String, Integer> lengthOfString = String::length;
        System.out.println(lengthOfString.apply("arun"));

        Function<Integer, Integer> squareOfNumber = (i) -> i * i;
        System.out.println(squareOfNumber.apply(10));

        Function<String, Boolean> strGreaterThan5 = s -> s.length() > 5;

        System.out.println(strGreaterThan5.apply("floor"));

        String str = "arun is going to office";
        Function<String, String> removeSpace = s -> s.replace(" ", "");
        System.out.println(removeSpace.apply(str));

    }
}
