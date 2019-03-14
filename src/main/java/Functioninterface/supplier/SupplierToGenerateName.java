package Functioninterface.supplier;

import java.util.function.Supplier;

public class SupplierToGenerateName {

    public static void main(String[] args) {
        Supplier<String> name = () -> {
            String[] names = {"sunny", "bunny", "chinny", "dinny"};
            int index = (int) (Math.random() * 4);
            return names[index];
        };

        System.out.println(name.get());
    }
}
