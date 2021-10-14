package com.prajjyadav;

import java.util.Optional;

public class OptionalsExample {
    public static void main(String[] args) {
        Optional<String> hello = Optional.ofNullable(null);

        System.out.println(hello.isPresent());

        String orElse = hello.map(String::toUpperCase)
                .orElseGet(()->{
                    // do extra computation ie fetching from db
                    return "world";
                });
        System.out.println(orElse);
    }
}
