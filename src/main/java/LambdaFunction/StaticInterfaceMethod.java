package LambdaFunction;

import java.time.LocalDate;

public class StaticInterfaceMethod {
    public static void main(String[] args) {
        LocalDate localDate = StaticMethod.stringToLocalDate("2017-12-23");
        System.out.println(localDate);

        System.out.println(StaticMethod.checkIfLocalDateGreaterThanToday(localDate));
    }
}

interface StaticMethod {
    static LocalDate stringToLocalDate(String date) {
        return LocalDate.parse(date);
    }

    static boolean checkIfLocalDateGreaterThanToday(LocalDate localDate) {
        LocalDate now = LocalDate.now();
        return localDate.isAfter(now);
    }
}
