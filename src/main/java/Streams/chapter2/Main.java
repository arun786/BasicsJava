package Streams.chapter2;

import Streams.chapter2.model.Apple;
import Streams.chapter2.service.AppleGreenPredicate;
import Streams.chapter2.util.AppleUtil;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        To get Green Apples
         */
        List<Apple> apples = AppleUtil.populateApples();

        List<Apple> greenApple = AppleUtil.filterApple(apples, new AppleGreenPredicate());
        System.out.println(greenApple);

    }
}
