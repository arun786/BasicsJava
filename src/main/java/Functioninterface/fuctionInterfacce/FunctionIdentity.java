package Functioninterface.fuctionInterfacce;

import java.util.function.Function;

public class FunctionIdentity {

    public static void main(String[] args) {
        Function<String, String> f1 = Function.identity();
        String identity = f1.apply("Arun");
        System.out.println(identity); //will return Arun
    }
}
