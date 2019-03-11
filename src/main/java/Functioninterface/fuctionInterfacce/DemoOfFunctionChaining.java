package Functioninterface.fuctionInterfacce;

import java.util.function.Function;

public class DemoOfFunctionChaining {

    public static void main(String[] args) {
        Function<Integer, Integer> square = i -> i + i;
        Function<Integer, Integer> cube = i -> i * i * i;

        Integer apply = square.andThen(cube).apply(2);//o/p will be 64
        Integer apply1 = square.compose(cube).apply(2);//16

        System.out.println(apply);
        System.out.println(apply1);

    }
}
