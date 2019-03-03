package Functioninterface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;
import java.util.function.Predicate;

public class Authenticateuser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name ");
        String userName = scanner.next();
        System.out.println("Enter password ");
        String password = scanner.next();
        User user = new User(userName, password);


        Predicate<User> authenticateUser = u -> u.getUserName().equalsIgnoreCase("Arun");
        Predicate<User> authenticatePasswd = p -> p.getPassword().equals("abcd");

        boolean isUser = authenticateUser.test(user);
        boolean authenticatePwd = authenticatePasswd.test(user);


        if (isUser && authenticatePwd) {
            System.out.println("Valid user");
        } else {
            System.out.println("Invalid user");
        }
    }
}

@Getter
@Setter
@AllArgsConstructor
class User {
    private String userName;
    private String password;
}
