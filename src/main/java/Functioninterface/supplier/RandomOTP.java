package Functioninterface.supplier;

import java.util.function.Supplier;

public class RandomOTP {
    public static void main(String[] args) {

        Supplier<String> random = () -> {
            StringBuilder otp = new StringBuilder();

            for (int i = 0; i < 6; i++) {
                otp.append((int) (Math.random() * 10));
            }
            return String.valueOf(otp);
        };

        System.out.println(random.get());
    }
}
