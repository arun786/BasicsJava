package Functioninterface.PrimitiveTypeFunctionalInterface;

import java.util.function.IntPredicate;

public class IntPrimitiveTypeFunctionalInterface {

    public static void main(String[] args) {
        int[] numbers = {12, 13, 14, 14, 16, 27};

        IntPredicate even = c -> c % 2 == 0;
        for (int number : numbers) {
            if (even.test(number)) {
                System.out.println(number);
            }
        }

        //Another Example where we need to check for number is greater than 14 and is even
        IntPredicate greaterThan14 = c -> c > 14;
        System.out.println("------------------");
        for (int number : numbers) {
            if (even.and(greaterThan14).test(number)) {
                System.out.println(number);
            }
        }

        //If odd and less than 14
        System.out.println("-----------------");
        for (int number : numbers) {
            if (even.negate().and(greaterThan14.negate()).test(number)) {
                System.out.println(number);
            }
        }
    }
}
