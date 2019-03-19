package Functioninterface.PrimitiveTypeFunctionalInterface;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntFunctionTut {
    public static void main(String[] args) {

        /**
         * To Overcome the autoboxing and autoUnBoxing problem, we have primitive functions
         */
        /*
        Input as Int and output as Integer
         */
        IntFunction<Integer> square = n -> n * n;
        Integer squareOf6 = square.apply(6);
        System.out.println(squareOf6);

        /*

        /*
        It takes String as Argument but always returns int
         */
        ToIntFunction<String> los = String::length;
        System.out.println(los.applyAsInt("Arun"));

        /*
        It takes Int as input and double as return
         */
        IntToDoubleFunction sqrt = Math::sqrt;
        System.out.println(sqrt.applyAsDouble(10));
    }
}
