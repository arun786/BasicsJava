package Algorithms.array;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 3, 4};
        int[] duplicates = new int[5];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicates[k++] = numbers[i];
                }
            }
        }

        for (int i = 0; i < duplicates.length; i++) {
            System.out.println(duplicates[i]);
        }
    }
}
