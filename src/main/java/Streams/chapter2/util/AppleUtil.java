package Streams.chapter2.util;

import Streams.chapter2.model.Apple;
import Streams.chapter2.service.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class AppleUtil {

    public static List<Apple> filterApple(List<Apple> apples, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }


    public static List<Apple> populateApples() {
        List<Apple> apples = new ArrayList<>();
        Apple a1 = new Apple("Green", 10);
        Apple a2 = new Apple("Red", 20);
        Apple a3 = new Apple("Orange", 30);
        Apple a4 = new Apple("Yellow", 40);

        apples.add(a1);
        apples.add(a2);
        apples.add(a3);
        apples.add(a4);
        return apples;
    }
}
