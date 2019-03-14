package Functioninterface.supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierToGetSystemDate {
    public static void main(String[] args) {
        Supplier<LocalDate> now = LocalDate::now;

        System.out.println(now.get());

        Supplier<LocalDateTime> nowT = LocalDateTime::now;
        System.out.println(nowT.get());
    }
}
