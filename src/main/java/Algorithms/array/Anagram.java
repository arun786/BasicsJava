package Algorithms.array;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        System.out.println("Enter the first text...");
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.next();
        char[] first = firstNumber.toCharArray();

        System.out.println(firstNumber);
        System.out.println("Enter the second text...");
        String secondNumber = scanner.next();

        char[] second = secondNumber.toCharArray();
        boolean anagram = isAnagram(first, second);

        if (anagram) {
            System.out.println("Its an anagram");
        } else {
            System.out.println("Its not an anagram");
        }


    }

    public static boolean isAnagram(char[] firstNumber, char[] secondNumber) {
        if (firstNumber.length != secondNumber.length) {
            return false;
        }

        Arrays.sort(firstNumber);
        Arrays.sort(secondNumber);

        for (int i = 0; i < firstNumber.length; i++) {
            if (firstNumber[i] != secondNumber[i]) {
                return false;
            }
        }

        return true;
    }
}
