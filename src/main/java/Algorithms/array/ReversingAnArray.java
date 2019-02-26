package Algorithms.array;

public class ReversingAnArray {

    public static void main(String[] args) {
        int[] number = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(number[i]);
        }

        int[] reverse = new int[10];
        for (int i = 0, j = number.length - 1; i < 10; i++, j--) {
            reverse[i] = number[j];
        }

        System.out.println("Reverse....");
        for (int i = 0; i < 10; i++) {
            System.out.println(reverse[i]);
        }
    }
}
