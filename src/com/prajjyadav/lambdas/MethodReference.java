package com.prajjyadav.lambdas;

import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {
        Thread t = new Thread(()->printMessage());
        t.start();

        Thread t2 = new Thread(MethodReference::printMessage);
        // here we are calling static method printMessage of class MethodReference

        doProcess(s -> System.out.println(s));
        doProcess(System.out::println);
        // here we are calling println method of class System with object out
        // we don't need to supply input parameter because everything passed from calling place would directly pass to println

    }

    public static void printMessage() {
        System.out.println("Hello World!!");
    }

    public static void doProcess(Consumer<String> consumer) {
        consumer.accept("Hello");
    }
}
