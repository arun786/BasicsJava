package Algorithms.array;

public class ReversingAnArrayIteratingHalfWay {
    public static void main(String[] args) {

        int number[] = new int[10];

        for (int i = 0; i < 10; i++) {
            number[i] = i + 1;
        }

        int startIndex = 0;
        int endIndex = 9;

        while (startIndex < endIndex) {
            swap(number, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(number[i]);
        }
    }

    private static void swap(int[] number, int startIndex, int endIndex) {
        int temp = number[startIndex];
        number[startIndex] = number[endIndex];
        number[endIndex] = temp;
    }
}
