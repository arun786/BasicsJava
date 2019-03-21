package Streams.chapter2;

import Streams.chapter2.model.Apple;
import Streams.chapter2.util.AppleUtil;

import java.util.Comparator;
import java.util.List;

public class UseOfSorting {

    public static void main(String[] args) {
        List<Apple> apples = AppleUtil.populateApples();
        //Sort Apples based on Color

        //Use Of Lambda, Comparator compare interface takes 2 arguments
        apples.sort((a1, a2) -> a1.getColor().compareTo(a2.getColor()));
        System.out.println(apples);
        //[Apple(color=Green, weight=10), Apple(color=Orange, weight=30), Apple(color=Red, weight=20), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]

        apples = AppleUtil.populateApples();
        System.out.println("With ordering" + apples);
        //With ordering[Apple(color=Green, weight=10), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]
        //Use Of method references

        apples.sort(Comparator.comparing(Apple::getColor));
        System.out.println(apples);
        //[Apple(color=Green, weight=10), Apple(color=Orange, weight=30), Apple(color=Red, weight=20), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]

        apples = AppleUtil.populateApples();
        System.out.println("With ordering" + apples);
        //With ordering[Apple(color=Green, weight=10), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]

        //To reverse
        apples.sort(Comparator.comparing(Apple::getColor).reversed());
        System.out.println(apples);
        //[Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Green, weight=10)]

        //First Compare with color reverse it and then compare with size
        apples = AppleUtil.populateApples();
        System.out.println("With ordering" + apples);
        //With ordering[Apple(color=Green, weight=10), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]

        apples.sort(Comparator.comparing(Apple::getColor).reversed().thenComparing(Apple::getWeight));
        System.out.println(apples);
        //[Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=50), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Green, weight=10)]

        apples = AppleUtil.populateApples();
        System.out.println("With ordering" + apples);
        //With ordering[Apple(color=Green, weight=10), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]


        apples.sort(Comparator.comparing(Apple::getColor).reversed().thenComparing(Apple::getWeight).reversed());
        System.out.println(apples);
        //[Apple(color=Green, weight=10), Apple(color=Orange, weight=30), Apple(color=Red, weight=20), Apple(color=Yellow, weight=50), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30)]

    }
}
