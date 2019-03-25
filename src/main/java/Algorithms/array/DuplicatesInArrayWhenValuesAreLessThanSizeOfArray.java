package Algorithms.array;

import java.util.Scanner;

public class DuplicatesInArrayWhenValuesAreLessThanSizeOfArray {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 3, 2, 1};
        getDuplicateValuesWhenValuesIsLessThanSize(numbers);

        int[] numb = {1, 2, 3, 4, 1, 2, 4};
        System.out.println("------------");
        getDuplicateValuesWhenValuesIsLessThanSize(numb);

    }


    public static void getDuplicateValuesWhenValuesIsLessThanSize(int[] array) {

        int length = array.length;

        for (int i = 0; i < length; i++) {

            int valueAtValuedIndex = array[Math.abs(array[i])];
            if (valueAtValuedIndex > 0) {
                array[Math.abs(array[i])] = -valueAtValuedIndex;
            } else {
                String format = String.format("The value %s is duplicate", Math.abs(array[i]));
                System.out.println(format);
            }
        }
    }
}
