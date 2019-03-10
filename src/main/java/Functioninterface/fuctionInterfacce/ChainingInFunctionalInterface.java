package Functioninterface.fuctionInterfacce;

import java.util.function.Function;

public class ChainingInFunctionalInterface {

    public static void main(String[] args) {

        Function<String, String> toUpperCase = String::toUpperCase;

        Function<String, String> firstNineCharacters = s -> s.substring(0, 9);

        System.out.println(toUpperCase.apply("Arun")); //ARUN
        System.out.println(firstNineCharacters.apply("ThisIsArun")); //ThisIsAru

        String thisIsArun = toUpperCase.andThen(firstNineCharacters).apply("ThisIsArun");//first uppercase and then substring;
        System.out.println(thisIsArun); //THISISARU

        String thisIsArun1 = toUpperCase.compose(firstNineCharacters).apply("ThisIsArun");//first 9 characters and then upper case
        System.out.println(thisIsArun1); //THISISARU


    }
}
