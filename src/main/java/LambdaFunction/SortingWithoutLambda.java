package LambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingWithoutLambda {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(100);
        numbers.add(0);
        numbers.add(40);
        numbers.add(30);
        numbers.add(50);
        numbers.add(20);

        System.out.println("Without Sorting " + numbers);
        Collections.sort(numbers);
        System.out.println("Ascending Sorting " + numbers);
        Collections.sort(numbers, new DescendingOrder());
        System.out.println("Descending Sorting " + numbers);
    }

}

class DescendingOrder implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return +1;
        } else {
            return 0;
        }
    }
}
