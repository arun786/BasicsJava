package Functioninterface.ConsumerInterface;

import java.util.function.Consumer;

public class ConsumerAccept {

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("arun");
    }
}
