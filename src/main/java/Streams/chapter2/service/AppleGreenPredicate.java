package Streams.chapter2.service;

import Streams.chapter2.model.Apple;

public class AppleGreenPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("Green");
    }
}
