package Functioninterface.fuctionInterfacce;

import java.util.Scanner;
import java.util.function.Function;

public class AuthenticateUsingFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name");
        String userName = scanner.next();
        System.out.println("Enter password");
        String password = scanner.next();

        //Condition username take only the first five characters and can be any case and should be of value as ideal
        //password should be of value as workhard.


        Function<String, String> f1 = f -> f.substring(0, 5);
        Function<String, String> f2 = String::toUpperCase;

        if (f1.andThen(f2).apply(userName).equalsIgnoreCase("ideal") && password.equals("workhard")) {
            System.out.println("Valid user");
        } else {
            System.out.println("Invalid username/password");
        }
    }
}
