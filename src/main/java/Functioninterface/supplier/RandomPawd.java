package Functioninterface.supplier;

import java.util.function.Supplier;

public class RandomPawd {

    //Requirement

    //Password has to be 8 characters
    //Even places digits
    //Odd places upper case letter , special characters @#$

    public static String generatePassword() {
        String upperCaseLettersAndSymbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
        Supplier<Character> forOddPlaces = () -> upperCaseLettersAndSymbols.charAt((int) (Math.random() * 29));
        Supplier<Integer> forEvenPlaces = () -> (int) (Math.random() * 10);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                stringBuilder.append(forEvenPlaces.get());
            } else {
                stringBuilder.append(forOddPlaces.get());
            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        String s = generatePassword();
        System.out.println(s);
    }
}
