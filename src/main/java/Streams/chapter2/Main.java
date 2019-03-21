package Streams.chapter2;

import Streams.chapter2.model.Apple;
import Streams.chapter2.service.AppleGreenPredicate;
import Streams.chapter2.util.AppleUtil;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*
        To get Green Apples
         */
        List<Apple> apples = AppleUtil.populateApples();

        List<Apple> greenApple = AppleUtil.filterApple(apples, new AppleGreenPredicate());
        System.out.println(greenApple);

        //Same using Lambda Function

        List<Apple> lambdaGreenApple = AppleUtil.filterApple(apples, (Apple a) -> a.getColor().equalsIgnoreCase("green"));
        System.out.println(lambdaGreenApple);

        //using streams

        List<Apple> greenApplesUsingStreams = apples.stream().filter(a -> a.getColor().equalsIgnoreCase("green")).collect(Collectors.toList());
        System.out.println(greenApplesUsingStreams);

    }
}
